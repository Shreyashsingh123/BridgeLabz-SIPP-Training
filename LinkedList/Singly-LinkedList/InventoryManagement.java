class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;
    Item(String name, int id, int quantity, double price) {
    this.name = name;
    this.id = id;
    this.quantity = quantity;
    this.price = price;
    this.next = null;
    }
    }
    
    class Inventory {
    Item head;
    
    void addItem(String name, int id, int quantity, double price) {
    Item newItem = new Item(name, id, quantity, price);
    if (head == null) {
    head = newItem;
    return;
    }
    Item temp = head;
    while (temp.next != null) temp = temp.next;
    temp.next = newItem;
    }
    
    void removeItem(int id) {
    if (head == null) return;
    if (head.id == id) {
    head = head.next;
    return;
    }
    Item temp = head;
    while (temp.next != null && temp.next.id != id) temp = temp.next;
    if (temp.next != null) temp.next = temp.next.next;
    }
    
    void updateQuantity(int id, int quantity) {
    Item temp = head;
    while (temp != null) {
    if (temp.id == id) {
    temp.quantity = quantity;
    return;
    }
    temp = temp.next;
    }
    }
    
    Item searchById(int id) {
    Item temp = head;
    while (temp != null) {
    if (temp.id == id) return temp;
    temp = temp.next;
    }
    return null;
    }
    
    Item searchByName(String name) {
    Item temp = head;
    while (temp != null) {
    if (temp.name.equalsIgnoreCase(name)) return temp;
    temp = temp.next;
    }
    return null;
    }
    
    double totalValue() {
    double total = 0;
    Item temp = head;
    while (temp != null) {
    total += temp.price * temp.quantity;
    temp = temp.next;
    }
    return total;
    }
    
    void showInventory() {
    Item temp = head;
    while (temp != null) {
    System.out.println("Name: " + temp.name + ", ID: " + temp.id + ", Qty: " + temp.quantity + ", Price: " + temp.price);
    temp = temp.next;
    }
    }
    }
    
    public class InventoryManagement {
    public static void main(String[] args) {
    Inventory inv = new Inventory();
    inv.addItem("Pen", 1, 100, 5.5);
    inv.addItem("Notebook", 2, 50, 20);
    inv.addItem("Pencil", 3, 200, 2);
    inv.showInventory();
    System.out.println("Total Value: " + inv.totalValue());
    inv.updateQuantity(3, 180);
    Item found = inv.searchById(2);
    if (found != null) System.out.println("Found: " + found.name);
    inv.removeItem(1);
    System.out.println("After Deletion:");
    inv.showInventory();
    }
    }
    