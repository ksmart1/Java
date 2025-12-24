package bookinheritance;

public class Author {
    private String authorName;
    private String email;
    
    public Author()
    {
        // Default constructor
    }
    
    public Author(String authorName)
    {
        this.authorName = authorName;
    }
    
    public Author(String authorName, String email)
    {
        this.authorName = authorName;
        this.email = email;
    }
    
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }
    
    public String getAuthorName()
    {
        return this.authorName;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return this.email;
    }
}
