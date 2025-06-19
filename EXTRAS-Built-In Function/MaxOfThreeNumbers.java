import java.util.*;
public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int ans=max(num1,num2,num3);
        System.out.print(ans+"is greatest among all three numbers");
    }

    public static int max(int n1,int n2, int n3){
if(n1>n2 &&n1>n3){
   return n1;
}
else if(n2>n1 &&n2>n3){
   return n2;
}
else{
   return n3;
}
    }
}

