import java.util.*;
class FeetToYards{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("distance in feet is: ");
int feet=sc.nextInt();
int yards=feet/3;
int miles=yards/1760;
System.out.println("The distance in yards is "+yards+" while the distance in miles is "+miles);
}
}