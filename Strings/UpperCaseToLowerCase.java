import java.util.Scanner;
public class UpperCaseToLowerCase {
    public static String convertToLowercase(String text) {
    String result = "";
    for (int i = 0; i < text.length(); i++) {
    char ch = text.charAt(i);
    if (ch >= 'A' && ch <= 'Z') result += (char)(ch + 32);
    else result += ch;
    }
    return result;
    }
    public static boolean compareStrings(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    for (int i = 0; i < s1.length(); i++) {
    if (s1.charAt(i) != s2.charAt(i)) return false;
    }
    return true;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the text: ");
    String input = sc.nextLine();
    String builtinLower = input.toLowerCase();
    String manualLower = convertToLowercase(input);
    boolean areEqual = compareStrings(builtinLower, manualLower);
    System.out.println("Original Text: " + input);
    System.out.println("Using toLowerCase(): " + builtinLower);
    System.out.println("Using manual conversion: " + manualLower);
    System.out.println("Are both results equal? " + areEqual);
    }
    }
      

