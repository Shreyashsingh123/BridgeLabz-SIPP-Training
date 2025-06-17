import java.util.Scanner;
public class NaturalNumberSum {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
if (n <= 0) {
System.out.println("Invalid input. Enter a natural number.");
return;
}
int sumRecursive = findSumRecursive(n);
int sumFormula = findSumFormula(n);
System.out.println("Sum using recursion: " + sumRecursive);
System.out.println("Sum using formula: " + sumFormula);
if (sumRecursive == sumFormula) System.out.println("Both results are equal");
else System.out.println("Results are different");
}
public static int findSumRecursive(int n) {
if (n == 1) return 1;
return n + findSumRecursive(n - 1);
}
public static int findSumFormula(int n) {
return n * (n + 1) / 2;
}
}

