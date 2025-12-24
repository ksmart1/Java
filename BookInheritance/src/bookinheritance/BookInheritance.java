package bookinheritance;
import java.util.Collections;
import java.util.ArrayList;

public class BookInheritance {

    public static void main(String[] args) {
        Fiction fiction1 = new Fiction("Doom", "Frank Herbert", 
                "frank@email.com", 39.95, "Science Fiction");
        //fiction1.displayBookInfo();
        Fiction fiction2 = new Fiction("Star Trek", "Gene Rodenberry", 
                "gene@gmail.com", 29.95, "Science Fiction");
        Fiction fiction3 = new Fiction("It", "Stephen King", 
                "steve@scary.com", 19.99, "Science Fiction");
        
        ArrayList<Fiction> list = new ArrayList<>();
        list.add(fiction1);
        list.add(fiction2);
        list.add(fiction3);
        
        Collections.sort(list);
        
        for (Fiction f : list)
        {
            f.displayBookInfo();
        }
    }
    
}
