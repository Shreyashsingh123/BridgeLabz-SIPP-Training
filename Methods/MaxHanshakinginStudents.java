import java.util.Scanner;
    public class MaxHanshakinginStudents {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int numberOfStudents = scanner.nextInt();
int handshakes = solve(numberOfStudents);
System.out.println("Maximum number of handshakes: " + handshakes);
}
public static int solve(int n) {
return (n * (n - 1)) / 2;
}
}
