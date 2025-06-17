import java.util.Scanner;
public class AtheleteRound{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double side1 = scanner.nextDouble();
double side2 = scanner.nextDouble();
double side3 = scanner.nextDouble();
double rounds = calculateRounds(side1, side2, side3);
System.out.println("The total number of rounds the athlete will run is " + rounds);
}
public static double calculateRounds(double a, double b, double c) {
double perimeter = a + b + c;
return 5000 / perimeter;
}
}
