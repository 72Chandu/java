/*
Imagine you are developing a library management system where users can borrow different type of items like books ,
magazines etc . (Assume items as you like ) Each item has unique details (books feature or magazine features, paper details etc)
are stored in the library but these items follow a similar borrowing process. How you would use abstraction to design this system.
*/
// Abstract class representing a generic library item
abstract class LibraryItem {
    private String id;
    private String title;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    // Common method for borrowing
    public void borrowItem() {
        System.out.println("Item '" + title + "' has been borrowed.");
    }

    // Common method for returning
    public void returnItem() {
        System.out.println("Item '" + title + "' has been returned.");
    }

    // Abstract method for item-specific details
    public abstract void displayDetails();

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

// Book class inheriting LibraryItem
class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String id, String title, String author, int pages) {
        super(id, title);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

// Magazine class inheriting LibraryItem
class Magazine extends LibraryItem {
    private String issueDate;
    private String publisher;

    public Magazine(String id, String title, String issueDate, String publisher) {
        super(id, title);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Publisher: " + publisher);
    }
}

// Newspaper class inheriting LibraryItem
class Newspaper extends LibraryItem {
    private String publicationDate;

    public Newspaper(String id, String title, String publicationDate) {
        super(id, title);
        this.publicationDate = publicationDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Newspaper Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Publication Date: " + publicationDate);
    }
}

// Main class to demonstrate the library system
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B101", "Java Programming", "John Doe", 500);
        LibraryItem magazine = new Magazine("M202", "Tech Today", "October 2024", "TechPublisher");
        LibraryItem newspaper = new Newspaper("N303", "Daily News", "2024-11-17");

        // Borrowing items
        book.borrowItem();
        magazine.borrowItem();
        newspaper.borrowItem();

        // Displaying item details
        System.out.println();
        book.displayDetails();
        System.out.println();
        magazine.displayDetails();
        System.out.println();
        newspaper.displayDetails();

        // Returning items
        System.out.println();
        book.returnItem();
        magazine.returnItem();
        newspaper.returnItem();
    }
}

/*
Item 'Java Programming' has been borrowed.
Item 'Tech Today' has been borrowed.
Item 'Daily News' has been borrowed.

Book Details:
ID: B101
Title: Java Programming
Author: John Doe
Pages: 500

Magazine Details:
ID: M202
Title: Tech Today
Issue Date: October 2024
Publisher: TechPublisher

Newspaper Details:
ID: N303
Title: Daily News
Publication Date: 2024-11-17

Item 'Java Programming' has been returned.
Item 'Tech Today' has been returned.
Item 'Daily News' has been returned.

*/