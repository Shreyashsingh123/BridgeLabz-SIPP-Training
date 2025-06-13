import java.util.*;
class AreaOfTriangle{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("base is: ");
double base=sc.nextDouble();
System.out.print("height is: ");
double height=sc.nextDouble();
double areaInches=0.5*base*height;
double areaCm=areaInches*6.4516;
System.out.println("The Area of the triangle in sq in is "+areaInches+" and sq cm is "+areaCm);
}
}