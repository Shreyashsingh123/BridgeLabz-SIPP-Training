import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int n=sc.nextInt();
        Boolean solve=primecheck(n);
        if(solve){
            System.out.print("The given Number  "+ n + " " +"is Prime Number");
        }
        else{
            System.out.print("The given Number "+ n +" " +"is not Prime Number");
        }
    }
    public static boolean primecheck(int n){
int c=0;
        for(int i=1;i<2*n;i++){
    if(n%i==0){
        c++;
        if(c>2){
            return false;
        }
    }
}
return true;
    }
}
