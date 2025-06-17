
    import java.util.Scanner;
    public class FizzBuzz {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n > 0) {
    String[] ans = new String[n + 1];
    for (int i = 0; i <= n; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
    ans[i] = "FizzBuzz";
    } else if (i % 3 == 0) {
    ans[i] = "Fizz";
    } else if (i % 5 == 0) {
    ans[i] = "Buzz";
    } else {
    ans[i] = String.valueOf(i);
    }
    }
    for (int i = 0; i <= n; i++) {
    System.out.println("Position " + i + " = " + ans[i]);
    }
    } else {
    System.out.println("Please enter a positive integer");
    }
    }
    }
     

