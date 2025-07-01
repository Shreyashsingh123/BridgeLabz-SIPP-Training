public class movieTicketDetails {
        public static void main(String[] args) {
MovieTicket ticket1 = new MovieTicket();
MovieTicket ticket2 = new MovieTicket();
ticket1.bookTicket("Avengers: Endgame", 15, 250.0);
ticket2.bookTicket("Pushpa-2", 12, 580.0);
ticket1.displayTicket();
ticket2.displayTicket();
        }
    }
    
class MovieTicket {
String movieName;
int seatNumber;
double price;
    
void bookTicket(String movieName, int seatNumber, double price) {
    this.movieName = movieName;
    this.seatNumber = seatNumber;
    this.price = price;
}
    
void displayTicket() {
System.out.println("Movie Name is: " + movieName);
System.out.println("Seat Number is: " + seatNumber);
System.out.println("Price: " + price);
System.out.println("");
        }
    }

