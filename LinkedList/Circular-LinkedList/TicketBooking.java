class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;
    
    Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
    this.ticketId = ticketId;
    this.customerName = customerName;
    this.movieName = movieName;
    this.seatNumber = seatNumber;
    this.bookingTime = bookingTime;
    this.next = null;
    }
    }
    
    class TicketReservationSystem {
    Ticket head = null;
    
    void addTicket(Ticket newTicket) {
    if (head == null) {
    head = newTicket;
    head.next = head;
    } else {
    Ticket temp = head;
    while (temp.next != head) {
    temp = temp.next;
    }
    temp.next = newTicket;
    newTicket.next = head;
    }
    }
    
    void removeTicket(int ticketId) {
    if (head == null) return;
    Ticket temp = head;
    Ticket prev = null;
    do {
    if (temp.ticketId == ticketId) {
    if (temp == head) {
    if (head.next == head) {
    head = null;
    return;
    }
    Ticket last = head;
    while (last.next != head) {
    last = last.next;
    }
    head = head.next;
    last.next = head;
    } else {
    prev.next = temp.next;
    }
    System.out.println("Ticket ID " + ticketId + " removed.");
    return;
    }
    prev = temp;
    temp = temp.next;
    } while (temp != head);
    System.out.println("Ticket ID not found.");
    }
    
    void displayTickets() {
    if (head == null) {
    System.out.println("No tickets found.");
    return;
    }
    Ticket temp = head;
    do {
    System.out.println("ID: " + temp.ticketId + ", Name: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
    temp = temp.next;
    } while (temp != head);
    }
    
    void searchTicket(String keyword) {
    if (head == null) {
    System.out.println("No tickets available.");
    return;
    }
    Ticket temp = head;
    boolean found = false;
    do {
    if (temp.customerName.equalsIgnoreCase(keyword) || temp.movieName.equalsIgnoreCase(keyword)) {
    System.out.println("Found Ticket: ID=" + temp.ticketId + ", Name=" + temp.customerName + ", Movie=" + temp.movieName);
    found = true;
    }
    temp = temp.next;
    } while (temp != head);
    if (!found) System.out.println("No matching ticket found.");
    }
    
    int countTickets() {
    if (head == null) return 0;
    int count = 0;
    Ticket temp = head;
    do {
    count++;
    temp = temp.next;
    } while (temp != head);
    return count;
    }
    }
    public class TicketBooking {
        public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        
        system.addTicket(new Ticket(1, "Alice", "Inception", "A1", "10:00 AM"));
        system.addTicket(new Ticket(2, "Bob", "Avatar", "B2", "12:00 PM"));
        system.addTicket(new Ticket(3, "Charlie", "Inception", "A2", "10:00 AM"));
        
        System.out.println("All Tickets:");
        system.displayTickets();
        
        System.out.println("\nSearching for Movie: Inception");
        system.searchTicket("Inception");
        
        System.out.println("\nRemoving Ticket ID 2");
        system.removeTicket(2);
        
        System.out.println("\nAll Tickets After Removal:");
        system.displayTickets();
        
        System.out.println("\nTotal Tickets: " + system.countTickets());
        }
        }
            