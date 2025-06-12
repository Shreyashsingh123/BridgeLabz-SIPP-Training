import java.util.*;
class RemainderandQuotient{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter num1: ");
int num1=sc.nextInt();
System.out.print("Enter num2: ");
int num2=sc.nextInt();
int quotient=num1/num2;
int remainder=num1%num2;
System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+num1+" and "+num2);
}
}
