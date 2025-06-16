import java.util.*;
public class OddEvenNumber {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
            return;
        }
        int size = number / 2 + 1;  // Maximum possible odd or even numbers between 1 and number
        int[] odd = new int[size];
        int[] even = new int[size];

        // Step 3: Create index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;

        // Step 4: Iterate from 1 to number and fill arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex] = i;
                evenIndex++;
            } else {
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Step 5: Print odd numbers
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        // Print even numbers
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }
}


