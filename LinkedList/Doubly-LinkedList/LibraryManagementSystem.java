
// public class LibraryManagementSystem
class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book next, prev;
    
    Book(String title, String author, String genre, int id, boolean available) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.id = id;
    this.available = available;
    }
    }
    
    class Library {
    Book head, tail;
    
    void addAtEnd(String title, String author, String genre, int id, boolean available) {
    Book b = new Book(title, author, genre, id, available);
    if (head == null) {
    head = tail = b;
    } else {
    tail.next = b;
    b.prev = tail;
    tail = b;
    }
    }
    
    void addAtBeginning(String title, String author, String genre, int id, boolean available) {
    Book b = new Book(title, author, genre, id, available);
    if (head == null) {
    head = tail = b;
    } else {
    b.next = head;
    head.prev = b;
    head = b;
    }
    }
    
    void addAtPosition(int pos, String title, String author, String genre, int id, boolean available) {
    if (pos <= 1) {
    addAtBeginning(title, author, genre, id, available);
    return;
    }
    Book b = new Book(title, author, genre, id, available);
    Book temp = head;
    for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
    if (temp == null || temp.next == null) {
    addAtEnd(title, author, genre, id, available);
    return;
    }
    b.next = temp.next;
    b.prev = temp;
    temp.next.prev = b;
    temp.next = b;
    }
    
    void removeById(int id) {
    Book temp = head;
    while (temp != null) {
    if (temp.id == id) {
    if (temp == head) head = temp.next;
    if (temp == tail) tail = temp.prev;
    if (temp.prev != null) temp.prev.next = temp.next;
    if (temp.next != null) temp.next.prev = temp.prev;
    return;
    }
    temp = temp.next;
    }
    }
    
    void updateAvailability(int id, boolean status) {
    Book temp = head;
    while (temp != null) {
    if (temp.id == id) {
    temp.available = status;
    return;
    }
    temp = temp.next;
    }
    }
    
    void searchByTitle(String title) {
    Book temp = head;
    while (temp != null) {
    if (temp.title.equalsIgnoreCase(title)) {
    System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.id + " | " + temp.available);
    }
    temp = temp.next;
    }
    }
    
    void searchByAuthor(String author) {
    Book temp = head;
    while (temp != null) {
    if (temp.author.equalsIgnoreCase(author)) {
    System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.id + " | " + temp.available);
    }
    temp = temp.next;
    }
    }
    
    void displayForward() {
    Book temp = head;
    while (temp != null) {
    System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.id + " | " + temp.available);
    temp = temp.next;
    }
    }
    
    void displayReverse() {
    Book temp = tail;
    while (temp != null) {
    System.out.println(temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.id + " | " + temp.available);
    temp = temp.prev;
    }
    }
    
    int countBooks() {
    int count = 0;
    Book temp = head;
    while (temp != null) {
    count++;
    temp = temp.next;
    }
    return count;
    }
    }
    
    public class LibraryManagementSystem {
    public static void main(String[] args) {
    Library lib = new Library();
    lib.addAtEnd("Book A", "Author X", "Fiction", 1, true);
    lib.addAtBeginning("Book B", "Author Y", "Sci-Fi", 2, false);
    lib.addAtPosition(2, "Book C", "Author X", "Drama", 3, true);
    lib.displayForward();
    System.out.println("Total books: " + lib.countBooks());
    lib.updateAvailability(2, true);
    lib.removeById(1);
    System.out.println("After update and delete:");
    lib.displayForward();
    System.out.println("Reverse order:");
    lib.displayReverse();
    System.out.println("Search by title:");
    lib.searchByTitle("Book C");
    System.out.println("Search by author:");
    lib.searchByAuthor("Author X");
    }
    }
    