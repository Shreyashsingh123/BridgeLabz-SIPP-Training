import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int add=Add(num1,num2);
int sub=Sub(num1,num2);
int mul=Mul(num1,num2);
int divide=Div(num1,num2);
System.out.println("The Addition of two numer  "+num1 +" and  "+num2+" is"+ add);
System.out.println("The Subtraction of two numer  "+num1 +"  and "+num2+" is"+ sub);
System.out.println("The ultiplication of two numer  "+num1 +" and "+num2+" is"+ mul);
System.out.println("TheDivision of two numer  "+num1 +" and  "+num2+" is"+ divide);
}
public static int Add(int n1,int n2){
    return n1+n2;
}
public static int Sub(int n1,int n2){
  return n1-n2;
}
public static int Mul(int n1,int n2){
    return n1*n2;
}
public static int Div(int n1,int n2){
    return n1/n2;
}
}
