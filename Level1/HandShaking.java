import java.util.*;
class HandShaking {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter total number of students: ");
int n=sc.nextInt();
int handshake=n*(n-1)/2;
System.out.println("Maximum number of handshakes among "+n+" students is "+handshake);
}
}