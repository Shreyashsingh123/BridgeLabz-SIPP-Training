import java.util.*;
class FessDiscount {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print(" fees is : ");
double fees=sc.nextDouble();
System.out.print("Discount Percent is: ");
double discountPercent=sc.nextDouble();
double discount=fees*discountPercent/100;
double finalfees=fees-discount;
System.out.println("The discount amount is INR "+discount+" and final discounted fees is INR "+finalfees);
}
}