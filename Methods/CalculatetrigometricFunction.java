import java.util.Scanner;
public class CalculatetrigometricFunction {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double angle = scanner.nextDouble();
double[] result = calculateTrigonometricFunctions(angle);
System.out.println("Sine: " + result[0]);
System.out.println("Cosine: " + result[1]);
System.out.println("Tangent: " + result[2]);
}
public static double[] calculateTrigonometricFunctions(double angle) {
double radians = Math.toRadians(angle);
double[] res = new double[3];
res[0] = Math.sin(radians);
res[1] = Math.cos(radians);
res[2] = Math.tan(radians);
return res;
}
}
