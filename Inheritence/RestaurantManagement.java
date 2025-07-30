interface Worker {
    void performDuties();
    }
    
    class Person {
    String name;
    int id;
    Person(String name, int id) {
    this.name = name;
    this.id = id;
    }
    void showInfo() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    }
    }
    
    class Chef extends Person implements Worker {
    Chef(String name, int id) {
    super(name, id);
    }
    public void performDuties() {
    System.out.println(name + " is preparing food.");
    }
    }
    
    class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
    super(name, id);
    }
    public void performDuties() {
    System.out.println(name + " is serving customers.");
    }
    }
    
    public class RestaurantManagement {
    public static void main(String[] args) {
    Worker w1 = new Chef("Arjun", 101);
    Worker w2 = new Waiter("Ravi", 102);
    ((Person)w1).showInfo();
    w1.performDuties();
    System.out.println("");
    ((Person)w2).showInfo();
    w2.performDuties();
    }
    }
    