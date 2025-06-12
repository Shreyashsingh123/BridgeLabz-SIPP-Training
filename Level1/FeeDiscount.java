class FeeDiscount {
public static void main(String[] args) {
double fee=125000;
double discountPercentage=0;
double discount=fee*discountPercentage / 100;
double finalFee=fee-discount;
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}