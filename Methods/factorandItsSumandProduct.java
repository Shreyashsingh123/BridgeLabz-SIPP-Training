import java.util.Scanner;
public class factorandItsSumandProduct {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int[] factors = solve(number);
System.out.print("Factors: ");
for (int factor : factors) System.out.print(factor + " ");
System.out.println();
System.out.println("Sum of factors: " + sum(factors));
System.out.println("Product of factors: " + product(factors));
System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
}
public static int[] solve(int n) {
int count = 0;
for (int i = 1; i <= n; i++) if (n % i == 0) count++;
int[] factors = new int[count];
int index = 0;
for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;
return factors;
}
public static int sum(int[] arr) {
int sum = 0;
for (int num : arr) sum += num;
return sum;
}
public static int product(int[] arr) {
int product = 1;
for (int num : arr) product *= num;
return product;
}
public static double sumOfSquares(int[] arr) {
double sum = 0;
for (int num : arr) sum += Math.pow(num, 2);
return sum;
}
}