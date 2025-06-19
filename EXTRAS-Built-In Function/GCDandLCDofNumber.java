
import java.util.*;
public class GCDandLCDofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1"+" ");
int num1=sc.nextInt();
System.out.print("Enter num2"+" ");
int num2=sc.nextInt();
int gcd=GCD(num1,num2);
int lcd=LCD(num1,num2);
System.out.println("The LCM of "+ " "+num1+ "  and"+" "+num2+" is"+" "+ lcd);
System.out.println("The HCF of "+ " "+num1+ "  and"+" "+num2+" is"+" "+gcd);
    }
    public static int GCD(int n1,int n2){
    int last=0;
        if(n1>n2){
            last=n1;
        }
        else{
            last=n2;
        }
        for(int i=last;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return 0;
    }
    public static int LCD(int n1,int n2){
        int max=(n1>n2)?n1:n2;
        while(true){
        if(max%n1==0 && max%n2==0){
            // System.out.print("The LCM of "+ " "+n1+ "and"+" "+n2+" is"+" "+ max);
           break;
        }
       max++;
    }
        return max;
    }
}
