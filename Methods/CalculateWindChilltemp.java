
import java.util.Scanner;
public class CalculateWindChilltemp {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double temperature = scanner.nextDouble();
double windSpeed = scanner.nextDouble();
double windChill = solve(temperature, windSpeed);
System.out.println("Wind Chill Temperature: " + windChill);
}
public static double solve(double t, double v) {
return 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
}
}

