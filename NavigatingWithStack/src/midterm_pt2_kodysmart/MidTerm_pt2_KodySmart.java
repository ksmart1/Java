package midterm_pt2_kodysmart;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Stack;
import java.util.Scanner;

public class MidTerm_pt2_KodySmart {

    public static void main(String[] args) throws URISyntaxException {
        // Create stack that will pop preivously visited URL
        Scanner sc = new Scanner(System.in);
        
        Stack<String> history = new Stack<>();
        
        for(int i=0; i<3; i++)
        {
            System.out.print("Please enter a URL: ");
            //URI uriEntry = new URI(sc.nextLine());
            String uriEntry = sc.nextLine();
            history.push(uriEntry);
        }
        
        System.out.print("Would you like to navigate back to a former website? (Y/N): ");
        String goBack = sc.next();
        String answer = "";
        if(goBack.equalsIgnoreCase("y"))
        {
            System.out.println("1. " + history.elementAt(0));
            System.out.println("2. " + history.elementAt(1));
            System.out.println("3. " + history.elementAt(2));
            System.out.print("Enter the number that corresponds with your choice: ");
            int selection = sc.nextInt();
            
            switch (selection) {
                case 1:
                    String url = history.pop();
                    launchBrowserWithURL(url);
                    break;
                case 2:
                    String url2 = history.get(1);
                    launchBrowserWithURL(url2);
                    break;
                case 3:
                    String url3 = history.get(2);
                    launchBrowserWithURL(url3);
                    break;
                default:
                    
                    break;
            }
        }
        
        
        
    }
    
    public static void launchBrowserWithURL(String url)
    {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if(desktop != null && desktop.isSupported(Desktop.Action.BROWSE))
        {
            try
            {
                URI uri = new URI(url);
                desktop.browse(uri);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    
}
