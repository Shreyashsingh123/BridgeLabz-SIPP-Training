
import java.util.Scanner;
public class SimpleInterest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double principal = sc.nextDouble();
double rate = sc.nextDouble();
double time = sc.nextDouble();
double si = solve(principal, rate, time);
System.out.println("The Simple Interest is " + si + " for Principal " + principal + ",at Rate of Interest " + rate + " and Time is" + time);
}
public static double solve(double p, double r, double t) {
return (p * r * t) / 100;
}
}
