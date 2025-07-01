public class mobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S24", 7999.00);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 85900.00);

        System.out.println("First Mobile Phone  Details are :");
        phone1.displayDetails();
System.out.println();
        System.out.println("Second Mobile Phone  Details are :");
        phone2.displayDetails();
    }
}

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand name is : " + brand);
        System.out.println("Model is : " + model);
        System.out.println("Price is : " + price);
    }
}
