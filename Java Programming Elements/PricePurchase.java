import java.util.*;
class PricePurchase {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Unit Price is: ");
double unitPrice=sc.nextDouble();
System.out.print("Quantity is: ");
int quantity=sc.nextInt();
double total=unitPrice*quantity;
System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
}
}