import java.util.*;
class doubleOperation{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter num1: ");
double num1=sc.nextDouble();
System.out.print("Enter num2: ");
double num2=sc.nextDouble();
System.out.print("Enter num3: ");
double num3=sc.nextDouble();
double result1=num1+num2*num3;
double result2=num1*num2+num3;
double result3=num3+num1/num2;
double result4=num1%num2+num3;
System.out.println("The results of Double Operations are "+result1+", "+result2+", "+result3+", and "+result4);
}
}