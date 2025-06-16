
import java.util.*;
public class TotalSumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
Double arr[]=new Double[10];
Double total=0.00;
int i=0;
while(true){
    if(i>9)break;
    Double num=sc.nextDouble();
    if(num<=0){
        break;
    }
    else{
arr[i]=num;
i++;
    }
}
System.out.print("All the numbers arr " );
for(int k=0;k<10;k++){
   
    System.out.print(arr[k]+" ");
    total+=arr[k];
}
System.out.println();
System.out.println("Total value is"+" "+ total);
    }
}
