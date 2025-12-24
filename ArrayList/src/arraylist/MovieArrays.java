package arraylist;
import java.util.*;
import Models.*;


public class MovieArrays {

    public static void main(String[] args) {
        // Lab 5 - MovieArrays
       ArrayList<Movie> movies = new ArrayList<>();
        
        // Get hardcoded movies MovieArrays
        movies = MovieIO.getMovies();
        
        // Intialize new ArrayList to store movie genre information
        ArrayList<String> genre = new ArrayList<>();
        
        for (Movie m : movies)
        {
            String category = m.getGenre();
            genre.add(category);
        }
        
        System.out.println("Movie Categories: ");
        for (String c : genre)
        {
            System.out.print(c + " ");
        }
    }
    
}
