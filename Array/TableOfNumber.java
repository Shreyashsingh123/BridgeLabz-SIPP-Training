
import java.util.*;
public class TableOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int ans[]=new int[10];
for(int i=1;i<=10;i++){
    ans[i-1]=number*i;
}
for(int i=1;i<=10;i++){
    System.out.println(number + " * " + i + " = " + ans[i-1]);
}
    }
}
