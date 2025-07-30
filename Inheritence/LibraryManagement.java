class Book {
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
    this.title = title;
    this.publicationYear = publicationYear;
    }
    void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("Publication Year: " + publicationYear);
    }
    }
    
    class Author extends Book {
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
    super(title, publicationYear);
    this.name = name;
    this.bio = bio;
    }
    void displayInfo() {
    super.displayInfo();
    System.out.println("Author Name: " + name);
    System.out.println("Bio: " + bio);
    }
    }
    
    public class LibraryManagement {
    public static void main(String[] args) {
    Author a1 = new Author("The Java Journey", 2021, "John Doe", "An experienced Java developer and writer.");
    a1.displayInfo();
    }
    }
    