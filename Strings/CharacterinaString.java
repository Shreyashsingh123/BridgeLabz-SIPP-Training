import java.util.Scanner;
public class CharacterinaString {
public static char[] getCharacters(String text) {
char[] chars = new char[text.length()];
for (int i = 0; i < text.length(); i++) {
chars[i] = text.charAt(i);
}
return chars;
}
public static boolean compareArrays(char[] a1, char[] a2) {
if (a1.length != a2.length) return false;
for (int i = 0; i < a1.length; i++) {
if (a1[i] != a2[i]) return false;
}
return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = sc.next();
char[] builtinArray = input.toCharArray();
char[] manualArray = getCharacters(input);
boolean areEqual = compareArrays(builtinArray, manualArray);
System.out.println("Using toCharArray(): ");
for (char c : builtinArray) System.out.print(c + " ");
System.out.println("\nUsing user-defined method: ");
for (char c : manualArray) System.out.print(c + " ");
System.out.println("\nAre both arrays equal? " + areEqual);
}
}
