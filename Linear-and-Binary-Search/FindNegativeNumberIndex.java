import java.util.*;
public class FindNegativeNumberIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter element of array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=-1;
        System.out.println("Negative number is at index ");
        for(int i=0;i<n;i++){
if(arr[i]<0){
   ans=i;
    break;
}
        }
        System.out.println(ans);
    }
}
