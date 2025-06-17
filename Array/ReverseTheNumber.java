    import java.util.Scanner;
    public class ReverseTheNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int maxDigit = 10;
    int[] digits = new int[maxDigit];
    int index = 0;
    while (number != 0) {
    if (index == maxDigit) {
    maxDigit *= 2;
    int[] temp = new int[maxDigit];
    for (int i = 0; i < index; i++) {
    temp[i] = digits[i];
    }
    digits = temp;
    }
    digits[index] = number % 10;
    number = number / 10;
    index++;
    }
    System.out.print("Reversed number: ");
    for (int i = 0; i < index; i++) {
    System.out.print(digits[i]);
    }
    }
    }
    
