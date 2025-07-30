interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // No extra charges
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    public String getDiscountDetails() {
        return "10% discount on Veg item";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 20; // ₹20 extra non-veg charge
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    public String getDiscountDetails() {
        return "5% discount on Non-Veg item";
    }
}

public class FooddeliverySystem {
    public static void processOrder(FoodItem[] orderList) {
        for (FoodItem item : orderList) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: ₹" + total);

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                double discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
                System.out.println("Discount: ₹" + discount);
                System.out.println("Final Price after Discount: ₹" + (total - discount));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[2];
        order[0] = new VegItem("Paneer Tikka", 200, 2);
        order[1] = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(order);
    }
}
