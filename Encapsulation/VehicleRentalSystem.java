interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
    }
    
    abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;
    Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
    this.vehicleNumber = vehicleNumber;
    this.type = type;
    this.rentalRate = rentalRate;
    this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public String getVehicleNumber() {
    return vehicleNumber;
    }
    public String getType() {
    return type;
    }
    public double getRentalRate() {
    return rentalRate;
    }
    public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    }
    public void setType(String type) {
    this.type = type;
    }
    public void setRentalRate(double rentalRate) {
    this.rentalRate = rentalRate;
    }
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
    this.insurancePolicyNumber = insurancePolicyNumber;
    }
    protected String getInsurancePolicyNumber() {
    return insurancePolicyNumber;
    }
    abstract double calculateRentalCost(int days);
    public void displayDetails() {
    System.out.println("Vehicle Number: " + vehicleNumber);
    System.out.println("Type: " + type);
    System.out.println("Rental Rate (per day): ₹" + rentalRate);
    }
    }
    
    class Car extends Vehicle implements Insurable {
    Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
    super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days) {
    return getRentalRate() * days + 500;
    }
    public double calculateInsurance() {
    return getRentalRate() * 0.12;
    }
    public String getInsuranceDetails() {
    return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
    }
    
    class Bike extends Vehicle implements Insurable {
    Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
    super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days) {
    return getRentalRate() * days + 100;
    }
    public double calculateInsurance() {
    return getRentalRate() * 0.05;
    }
    public String getInsuranceDetails() {
    return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
    }
    
    class Truck extends Vehicle implements Insurable {
    Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
    super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }
    public double calculateRentalCost(int days) {
    return getRentalRate() * days + 1000;
    }
    public double calculateInsurance() {
    return getRentalRate() * 0.2;
    }
    public String getInsuranceDetails() {
    return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
    }
    
    public class VehicleRentalSystem {
    public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Car("MH12AB1234", 1500, "CAR123456");
    vehicles[1] = new Bike("MH14XY4321", 500, "BIKE987654");
    vehicles[2] = new Truck("MH20TR9988", 3000, "TRUCK567890");
    int days = 5;
    for (Vehicle v : vehicles) {
    v.displayDetails();
    System.out.println("Rental for " + days + " days: ₹" + v.calculateRentalCost(days));
    if (v instanceof Insurable) {
    Insurable i = (Insurable)v;
    System.out.println("Insurance Cost: ₹" + i.calculateInsurance());
    System.out.println(i.getInsuranceDetails());
    }
    System.out.println("");
    }
    }
    }
    