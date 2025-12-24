package Models;
import java.util.*;

public class MovieIO {
    
    public static ArrayList<Movie> getMovies()
    {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Shawshank Redemption", "Drama"));
        movies.add(new Movie("Die Hard", "Action"));
        movies.add(new Movie("Die Hard with Vengenace", "Action"));
        movies.add(new Movie("The Italian Job", "Action"));
        movies.add(new Movie("Scream", "Horror"));
        movies.add(new Movie("Hostel", "Horror"));
        movies.add(new Movie("Happy Gilmore", "Comedy"));
        movies.add(new Movie("Get Hard", "Comedy"));
        movies.add(new Movie("Monsters Inc", "Children"));
        movies.add(new Movie("The Lincoln Lawyer", "Suspense"));
        
        return movies;
    }
}
