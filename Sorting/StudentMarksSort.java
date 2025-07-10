import java.util.*;
class StudentMarksSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter marks of students");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
solve(n,arr);
System.out.println("Marks after sorting ")
for(int i:arr){
    System.out.print(i+" ");
}
    }
    public static void solve(int n,int arr[]){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}