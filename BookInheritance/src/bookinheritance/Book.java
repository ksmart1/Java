package bookinheritance;

public class Book {
    // Protected variables can be accessed through a subclass
    protected String title;
    protected Author author;
    protected Double price;
    
    public Book()
    {
        
    }
    
    public Book(String title, double price)
    {
        this.title = title;
        this.price = price;
    }
    
    public Book(String title, String authorName, String email, double price)
    {
        this.title = title;
        this.author = new Author(authorName, email);
        this.price = price;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setAuthor(String authorName, String email)
    {
        this.author = new Author(authorName, email);
    }
    
    public Author getAuthor()
    {
        return this.author;
    }
    
    public void setPrice(Double price)
    {
        this.price = price;
    }
    
    public Double getPrice()
    {
        return this.price;
    }
}
