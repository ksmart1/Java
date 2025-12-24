package Models;

public class Movie {
    private String title;
    private String genre;
    
    public Movie()
    {
        // Default constructor
    }
    
    public Movie(String title, String genre)
    {
        this.title = title;
        this.genre = genre;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    public String getGenre()
    {
        return this.genre;
    }
}
