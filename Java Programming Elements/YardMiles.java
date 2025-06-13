import java.util.*;
class YardMiles {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter distance in feet: ");
double feet=sc.nextDouble();
double yard=feet/3;
double miles=yard/1760;
System.out.println("The distance is "+feet+" feet, "+yard+" yard, and "+miles+" miles.");
}
}