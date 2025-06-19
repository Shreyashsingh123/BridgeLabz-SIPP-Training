import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        int ans=fact(n);
        print(ans,n);
    }
    public static int fact (int n){
int ans=1;
if(n==1){
    return ans;
}
return n*fact(n-1);

} 
    public static void print(int ans,int n){
        System.out.print("The factorial of "+" " + n +"  is "+ ans);
    
}
}
