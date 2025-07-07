// MovieManagementSystem
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie prev, next;
    Movie(String title, String director, int year, double rating) {
    this.title = title;
    this.director = director;
    this.year = year;
    this.rating = rating;
    this.prev = null;
    this.next = null;
    }
    }
    
    class MovieList {
    Movie head, tail;
    
    void addAtBeginning(String title, String director, int year, double rating) {
    Movie newMovie = new Movie(title, director, year, rating);
    if (head == null) {
    head = tail = newMovie;
    return;
    }
    newMovie.next = head;
    head.prev = newMovie;
    head = newMovie;
    }
    
    void addAtEnd(String title, String director, int year, double rating) {
    Movie newMovie = new Movie(title, director, year, rating);
    if (tail == null) {
    head = tail = newMovie;
    return;
    }
    tail.next = newMovie;
    newMovie.prev = tail;
    tail = newMovie;
    }
    
    void addAtPosition(int pos, String title, String director, int year, double rating) {
    if (pos <= 1) {
    addAtBeginning(title, director, year, rating);
    return;
    }
    Movie newMovie = new Movie(title, director, year, rating);
    Movie temp = head;
    for (int i = 1; temp != null && i < pos - 1; i++) temp = temp.next;
    if (temp == null || temp.next == null) {
    addAtEnd(title, director, year, rating);
    return;
    }
    newMovie.next = temp.next;
    newMovie.prev = temp;
    temp.next.prev = newMovie;
    temp.next = newMovie;
    }
    
    void removeByTitle(String title) {
    Movie temp = head;
    while (temp != null) {
    if (temp.title.equalsIgnoreCase(title)) {
    if (temp == head && temp == tail) {
    head = tail = null;
    } else if (temp == head) {
    head = head.next;
    head.prev = null;
    } else if (temp == tail) {
    tail = tail.prev;
    tail.next = null;
    } else {
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;
    }
    return;
    }
    temp = temp.next;
    }
    }
    
    void searchByDirector(String director) {
    Movie temp = head;
    while (temp != null) {
    if (temp.director.equalsIgnoreCase(director)) {
    System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
    }
    temp = temp.next;
    }
    }
    
    void searchByRating(double rating) {
    Movie temp = head;
    while (temp != null) {
    if (temp.rating == rating) {
    System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
    }
    temp = temp.next;
    }
    }
    
    void updateRating(String title, double newRating) {
    Movie temp = head;
    while (temp != null) {
    if (temp.title.equalsIgnoreCase(title)) {
    temp.rating = newRating;
    return;
    }
    temp = temp.next;
    }
    }
    
    void displayForward() {
    Movie temp = head;
    System.out.println("Movies (Forward):");
    while (temp != null) {
    System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
    temp = temp.next;
    }
    }
    
    void displayBackward() {
    Movie temp = tail;
    System.out.println("Movies (Reverse):");
    while (temp != null) {
    System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
    temp = temp.prev;
    }
    }
    }
    
    public class MovieManagementSystem {
    public static void main(String[] args) {
    MovieList ml = new MovieList();
    ml.addAtEnd("Inception", "williams", 2010, 8.8);
    ml.addAtBeginning("Interstellar", "williams", 2014, 8.6);
    ml.addAtEnd("The Prestige", "williams", 2006, 8.5);
    ml.addAtPosition(2, "Tenet", "williams", 2020, 7.5);
    ml.displayForward();
    ml.displayBackward();
    ml.updateRating("Tenet", 8.0);
    ml.removeByTitle("Inception");
    System.out.println("After update and delete:");
    ml.displayForward();
    System.out.println("Movies by williams:");
    ml.searchByDirector("williams");
    System.out.println("Movies with rating 8.5:");
    ml.searchByRating(8.5);
    }
    }
    
