import java.util.Scanner;
public class SubStringComparison {

public static String createSubstring(String text, int start, int end) {
String result = "";
for (int i = start; i < end; i++) {
result += text.charAt(i);
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
String input = sc.next();
System.out.print("Enter start index: ");
int start = sc.nextInt();
System.out.print("Enter end index: ");
int end = sc.nextInt();
String builtinSub = input.substring(start, end);
String manualSub = createSubstring(input, start, end);
boolean areEqual = compareStrings(builtinSub, manualSub);
System.out.println("Using substring(): " + builtinSub);
System.out.println("Using manual method: " + manualSub);
System.out.println("Are both substrings equal? " + areEqual);
}
}
