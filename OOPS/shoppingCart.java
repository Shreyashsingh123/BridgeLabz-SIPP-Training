public class shoppingCart {
        public static void main(String[] args) {
CartItem item1 = new CartItem();
CartItem item2 = new CartItem();
item1.addItem("Laptop", 55000, 1);
item2.addItem("Earphones", 500, 2);
item1.displayTotalCost();
item2.displayTotalCost();
item2.removeItem();
item2.displayTotalCost();
        }
    }
    
    class CartItem {
String itemName;
double price;
int quantity;
   void addItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
        }
    
void removeItem() {
    System.out.println("Removed item: " + itemName);
    quantity = 0;
        }
     void displayTotalCost() {
double total = price * quantity;
System.out.println("Item is : " + itemName);
System.out.println("Quantity is: " + quantity);
System.out.println("Total Cost is: " + total);
System.out.println("");
        }
    }

