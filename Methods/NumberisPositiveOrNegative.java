import java.util.Scanner;
public class NumberisPositiveOrNegative {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int result = solve(number);
if (result == 1) System.out.println("Positive");
else if (result == -1) System.out.println("Negative");
else System.out.println("Zero");
}
public static int solve(int n) {
if (n > 0) return 1;
else if (n < 0) return -1;
else return 0;
}
}

