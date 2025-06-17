import java.util.Scanner;
public class QuotientRemainder {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int number = scanner.nextInt();
int divisor = scanner.nextInt();
int[] result = findRemainderAndQuotient(number, divisor);
System.out.println("Quotient: " + result[0]);
System.out.println("Remainder: " + result[1]);
}
public static int[] findRemainderAndQuotient(int number, int divisor) {
int[] res = new int[2];
res[0] = number / divisor;
res[1] = number % divisor;
return res;
}
}
