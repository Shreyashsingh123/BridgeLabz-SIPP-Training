import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate/km: ₹" + ratePerKm);
        System.out.println("Location: " + currentLocation);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    public String getCurrentLocation() {
        return getCurrentLocation();
    }

    public void updateLocation(String location) {
        setCurrentLocation(location);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() {
        return getCurrentLocation();
    }

    public void updateLocation(String location) {
        setCurrentLocation(location);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 30;
    }

    public String getCurrentLocation() {
        return getCurrentLocation();
    }

    public void updateLocation(String location) {
        setCurrentLocation(location);
    }
}

public class RideHailingApplication {
    public static void processRides(List<Vehicle> rides, double distance) {
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C101", "Ravi", 15.0, "MG Road"));
        rides.add(new Bike("B202", "Ankit", 8.0, "Park Street"));
        rides.add(new Auto("A303", "Suresh", 10.0, "City Center"));

        processRides(rides, 12.5);
    }
}
