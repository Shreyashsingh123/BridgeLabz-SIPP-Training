public class ItemCostdetails{
    public static void main(String[] args) {
        Item item1 = new Item(101, "Wireless Mouse", 599.00);
        item1.display();
        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items is: " + totalCost);
    }
}


 
class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void display() {
        System.out.println("Item Code is : " + itemCode);
        System.out.println("Item Name is : " + itemName);
        System.out.println("Price per unit is: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}


