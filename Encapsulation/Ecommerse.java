interface Taxable {
    double calculateTax();
    String getTaxDetails();
    }
    
    abstract class Product {
    private int productId;
    private String name;
    private double price;
    Product(int productId, String name, double price) {
    this.productId = productId;
    this.name = name;
    this.price = price;
    }
    public int getProductId() {
    return productId;
    }
    public void setProductId(int productId) {
    this.productId = productId;
    }
    public String getName() {
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public double getPrice() {
    return price;
    }
    public void setPrice(double price) {
    this.price = price;
    }
    abstract double calculateDiscount();
    public void displayDetails() {
    System.out.println("Product ID: " + productId);
    System.out.println("Name: " + name);
    System.out.println("Price: ₹" + price);
    System.out.println("Discount: ₹" + calculateDiscount());
    }
    }
    
    class Electronics extends Product implements Taxable {
    Electronics(int productId, String name, double price) {
    super(productId, name, price);
    }
    public double calculateDiscount() {
    return getPrice() * 0.1;
    }
    public double calculateTax() {
    return getPrice() * 0.18;
    }
    public String getTaxDetails() {
    return "GST 18% applied";
    }
    }
    
    class Clothing extends Product implements Taxable {
    Clothing(int productId, String name, double price) {
    super(productId, name, price);
    }
    public double calculateDiscount() {
    return getPrice() * 0.15;
    }
    public double calculateTax() {
    return getPrice() * 0.05;
    }
    public String getTaxDetails() {
    return "GST 5% applied";
    }
    }
    
    class Groceries extends Product {
    Groceries(int productId, String name, double price) {
    super(productId, name, price);
    }
    public double calculateDiscount() {
    return getPrice() * 0.05;
    }
    }
    
    public class Ecommerse {
    public static void printFinalPrice(Product p) {
    p.displayDetails();
    double tax = 0;
    if (p instanceof Taxable) {
    tax = ((Taxable)p).calculateTax();
    System.out.println(((Taxable)p).getTaxDetails());
    }
    double finalPrice = p.getPrice() + tax - p.calculateDiscount();
    System.out.println("Final Price: ₹" + finalPrice);
    System.out.println("");
    }
    public static void main(String[] args) {
    Product[] products = new Product[3];
    products[0] = new Electronics(201, "Smartphone", 50000);
    products[1] = new Clothing(202, "T-Shirt", 2000);
    products[2] = new Groceries(203, "Rice", 800);
    for (Product p : products) {
    printFinalPrice(p);
    }
    }
    }
    