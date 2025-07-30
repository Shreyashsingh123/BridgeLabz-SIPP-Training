interface Refuelable {
    void refuel();
    }
    
    class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model) {
    this.maxSpeed = maxSpeed;
    this.model = model;
    }
    void showDetails() {
    System.out.println("Model: " + model);
    System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
    }
    
    class Electric extends Vehicle {
    Electric(int maxSpeed, String model) {
    super(maxSpeed, model);
    }
    void charge() {
    System.out.println(model + " is charging.");
    }
    }
    
    class Petrol extends Vehicle implements Refuelable {
    Petrol(int maxSpeed, String model) {
    super(maxSpeed, model);
    }
    public void refuel() {
    System.out.println(model + " is refueling.");
    }
    }
    
    public class VehicleManagement {
    public static void main(String[] args) {
    Electric ev = new Electric(150, "Tesla Model 3");
    Petrol pv = new Petrol(180, "Honda City");
    ev.showDetails();
    ev.charge();
    System.out.println("-----");
    pv.showDetails();
    pv.refuel();
    }
    }
    