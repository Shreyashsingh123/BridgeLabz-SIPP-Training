public class PalindromeNumber {
public static void main(String[] args) {
PalindromeChecker checker1 = new PalindromeChecker("madam");
PalindromeChecker checker2 = new PalindromeChecker("hello");
PalindromeChecker checker3 = new PalindromeChecker("naman");
checker1.displayResult();
checker2.displayResult();
checker3.displayResult();
        }
    }
    
class PalindromeChecker {
String text;
    
PalindromeChecker(String text) {
    this.text = text;
}
boolean isPalindrome() {
    String reversed = new StringBuilder(text).reverse().toString();
    return text.equalsIgnoreCase(reversed);
}
void displayResult() {
System.out.println("Text: " + text);
if (isPalindrome()) {
    System.out.println("Result: It is a palindrome");
} else {
    System.out.println("Result: It is not a palindrome");
}
System.out.println("");
        }
    }