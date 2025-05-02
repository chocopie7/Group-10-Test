/**
 * Book.java
 * 
 * A simple Book class for a library system.
 * Demonstrates class anatomy, constructors, getters/setters,
 * custom methods, static members, and comments.
 * 
 * @author John Doe
 * @version 1.0
 */
public class Book {
    /** Title of the book */
    private String title;
    
    /** Author of the book */
    private String author;
    
    /** Number of pages in the book */
    private int pages;
    
    /** Whether the book is currently checked out */
    private boolean isCheckedOut;
    
    /** Static counter for total number of Book objects created */
    private static int totalBooksCreated = 0;
    
    /**
     * Default constructor: sets default values.
     * (Empty title/author, 0 pages, not checked out)
     */
    public Book() {
        title = "";
        author = "";
        pages = 0;
        isCheckedOut = false;
        totalBooksCreated++;
    }
    
    /**
     * Constructor: sets title, author, and pages based on parameters.
     * Initially, the book is not checked out.
     * @param title   the book's title
     * @param author  the book's author
     * @param pages   number of pages in the book
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isCheckedOut = false;
        totalBooksCreated++;
    }
    
    /** @return the title of the book */
    public String getTitle() {
        return title;
    }
    
    /** @param title the new title of the book */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /** @return the author of the book */
    public String getAuthor() {
        return author;
    }
    
    /** @param author the new author of the book */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    /** @return the number of pages in the book */
    public int getPages() {
        return pages;
    }
    
    /** @param pages the new page count for the book */
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    /** @return true if the book is checked out, false otherwise */
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    
    /** Check out the book (sets isCheckedOut to true) */
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }
    
    /** Return the book (sets isCheckedOut to false) */
    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }
    
    /** @return the total number of Book objects created */
    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }
    
    /**
     * Main method to demonstrate the Book class.
     * Creates Book objects and calls methods on them.
     */
    public static void main(String[] args) {
        // Create two Book objects
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        
        // Show total books created (static variable)
        System.out.println("Total books created: " + Book.getTotalBooksCreated());
        
        // Show details of first book using getters
        System.out.println(b1.getTitle() + " by " + b1.getAuthor() 
                           + ", " + b1.getPages() + " pages. Checked out? " + b1.isCheckedOut());
        
        // Check out the first book
        b1.checkOut();
        System.out.println("Checked out? " + b1.isCheckedOut());
        
        // Try checking it out again
        b1.checkOut();
        
        // Return the first book
        b1.returnBook();
        System.out.println("Checked out? " + b1.isCheckedOut());
        
        // Check out and return second book
        b2.checkOut();
        b2.returnBook();
    }
}
