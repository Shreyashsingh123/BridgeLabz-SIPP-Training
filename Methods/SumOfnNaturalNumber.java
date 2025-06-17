import java.util.Scanner;
    public class SumOfnNaturalNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int sum = findSum(n);
System.out.println("Sum of first " + n + " natural numbers is " + sum);
}
public static int findSum(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i;
}
return sum;
}
}


