package genericlinkedlist;

public class Book {
    private String title;
    private String ISBN;
    private String publisher;
    
    public Book()
    {
        // Default constructor
    }
    
    public Book(String title, String ISBN, String publisher)
    {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }
    
    public String getISBN()
    {
        return this.ISBN;
    }
    
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    
    public String getPublisher()
    {
        return this.publisher;
    }
    
    @Override
    public String toString() {
        return title + " by " + publisher + " (ISBN: " + ISBN + ")";
    }
}
