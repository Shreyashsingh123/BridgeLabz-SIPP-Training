
import java.util.*;
public class LargestSmallestNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3 = sc.nextInt();
int[] result = solve(n1, n2, n3);
System.out.println("Smallest: " + result[0]);
System.out.println("Largest: " + result[1]);
}
public static int[] solve(int a, int b, int c) {
int smallest = Math.min(a, Math.min(b, c));
int largest = Math.max(a, Math.max(b, c));
return new int[]{smallest, largest};
}
}

