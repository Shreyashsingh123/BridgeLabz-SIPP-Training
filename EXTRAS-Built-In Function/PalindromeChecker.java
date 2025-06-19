import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String "+" ");
        String str=sc.next();
String ans=solve(str);
print(str,ans);

    }
    public static String solve(String str){
String ans="";
 for(int i=str.length()-1;i>=0;i--){
ans+=str.charAt(i);
}
return ans;
    }
    public static void print(String str,String ans){
        if(str.equals(ans)){
            System.out.print("The given String "+" "+str+" " +"is Palindrome");
        }
        else{
            System.out.println("The given String "+" "+str+" " +"is not Palindrome");
        }
    }
}
