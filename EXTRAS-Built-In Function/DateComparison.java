import java.util.*;
import java.time.LocalDate;
public class DateComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Date (yyyy-mm-dd)");
        LocalDate date1=LocalDate.parse(sc.next());
        System.out.print("Enter Second Date (yyyy-mm-dd)");
        LocalDate date2=LocalDate.parse(sc.next());
        if(date1.isBefore(date2)){
            System.out.print("date1 is before date2");
        }
        else if(date1.isAfter(date2)){
            System.out.print("date1 is after date2");
        }
        else{
            System.out.print("date1 and date2 are same");
        }

    }
}
