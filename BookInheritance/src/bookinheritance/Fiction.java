package bookinheritance;

public class Fiction extends Book implements Comparable {
    private String fictionType;
    
    public Fiction(String title, String authorName, String email, 
            double price, String fictionType)
    {
        super(title, authorName, email, price);
        //this.fictionType = fictionType;
        setFictionType(fictionType);
    }
    
    public void setFictionType(String fictionType)
    {
        // Validates input
        // Write value after validation
        this.fictionType = fictionType;
    }
    
    public String getFictionType()
    {
        return this.fictionType;
    }
    
    public void setTitle(String title)
    {
        super.title = title;
    }
    
    public void displayBookInfo()
    {
        System.out.println("Title: " + super.getTitle());
        // Retrieve Author object from base class
        Author a = super.getAuthor();
        System.out.println("Author: " + a.getAuthorName() +
                " Email: " + a.getEmail());
        System.out.println("Price: $" + super.getPrice());
        System.out.println("Fiction Type: " + getFictionType());
    }
    
    @Override
    public int compareTo(Object o)
    {
        Fiction f = (Fiction) o;
        int sortResult = super.getPrice().compareTo(f.getPrice());
        if(sortResult < 0)
        {
            return -1;
        }
        else if(sortResult > 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
