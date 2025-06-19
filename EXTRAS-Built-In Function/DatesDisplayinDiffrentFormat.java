import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DatesDisplayinDiffrentFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatted1 = date.format(format);
        System.out.println("Current date in format dd/MM/yyyy is"+" " +formatted1);
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatted2 = date.format(format2);
        System.out.println("Current date in format yyyy-MM-dd is" +" " +formatted2);
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formatted3 = date.format(format3);
        System.out.println("Current date in format  EEE, MMM dd, yyyy is"+" " +formatted3);
    }
}
