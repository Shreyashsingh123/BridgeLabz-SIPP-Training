import java.util.*;
class Calculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enternum1: ");
int num1=sc.nextInt();
System.out.print("Enter num2: ");
int num2=sc.nextInt();
int add=num1+num2;
int sub=num1-num2;
int mul=num1*num2;
int div=num1/num2;
System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+num1+" and "+num2+" is "+add+", "+sub+", "+mul+", and "+div);
}
}