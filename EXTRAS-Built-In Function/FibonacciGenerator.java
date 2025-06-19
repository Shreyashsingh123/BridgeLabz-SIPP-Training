import java.util.*;
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of term till you want to generate fibonacci series"+" ");
        int n=sc.nextInt();
      int ans[]=new int[n];
      solve(n,ans);
print(ans);
    //   System.out.print("The Fibonacci Series is ");
    //   for(int i=0;i<ans.length;i++){
    //     System.out.print(ans[i]+" ");
    //   }

    }
    public static void solve(int n ,int arr[]){
int a=0,b=1;
arr[0]=a;
arr[1]=b;
for(int i=2;i<n;i++){
int c=a+b;
arr[i]=c;
a=b;
b=c;
}
    }
    public static void print(int ans[]){
    System.out.print("The Fibonacci Series is ");
      for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
      }
}
}
