import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

System.out.print("Enter temperature in Fahrenheit: ");
double f = sc.nextDouble();
System.out.println("The Temperature in Celsius is : " + celsius(f));
System.out.print("Enter temperature in Celsius: ");
double c = sc.nextDouble();
System.out.println("The Temperature in Fahrenheight is : " + fahrenheight(c));
    }

    public static double celsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double fahrenheight(double c) {
        return (c * 9 / 5) + 32;
    }
}