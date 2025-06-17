
import java.util.Scanner;
public class ChocolateDivider {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int numberOfChocolates = sc.nextInt();
int numberOfChildren = sc.nextInt();
int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
System.out.println("Chocolates per child: " + result[0]);
System.out.println("Remaining chocolates: " + result[1]);
}
public static int[] findRemainderAndQuotient(int number, int divisor) {
int[] res = new int[2];
res[0] = number / divisor;
res[1] = number % divisor;
return res;
}
}

