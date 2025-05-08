
public class Book {
    
    private String title;
    
   
    private String author;
    
    
    private int pages;
    
    
    private boolean isCheckedOut;
    

    private static int totalBooksCreated = 0;
    
    
    public Book() {
        title = "";
        author = "";
        pages = 0;
        isCheckedOut = false;
        totalBooksCreated++;
    }
    
    
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isCheckedOut = false;
        totalBooksCreated++;
    }
    
    //getters and setters
    public String getTitle() {
        return title;
    }
    
    
    public void setTitle(String title) {
        this.title = title;
    }
    
   
    public String getAuthor() {
        return author;
    }
    
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    public int getPages() {
        return pages;
    }
    
   
    public void setPages(int pages) {
        this.pages = pages;
    }
    
    
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    
    
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }
    
    
    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not checked out.");
        }
    }
    
    
    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }
    
   
    public static void main(String[] args) {
        
        Book b1 = new Book("1984", "George Orwell", 328);
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        
        
        System.out.println("Total books created: " + Book.getTotalBooksCreated());
        
       
        System.out.println(b1.getTitle() + " by " + b1.getAuthor() 
                           + ", " + b1.getPages() + " pages. Checked out? " + b1.isCheckedOut());
        
        
        b1.checkOut();
        System.out.println("Checked out? " + b1.isCheckedOut());
        
        
        b1.checkOut();
        
        
        b1.returnBook();
        System.out.println("Checked out? " + b1.isCheckedOut());
        
        
        b2.checkOut();
        b2.returnBook();
    }
}
