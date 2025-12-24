package bannerstack;
import java.util.Stack;
import java.util.Scanner;

public class StacksLab6 {

    public static void main(String[] args) {
        // Menu to create new, display, or undo the logo
        String userText = "";
        String addMore = "y";
        String addLine = "y";
        Stack<String> banner = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("""
                               Please choose an option below:
                               1. Create new banner
                               2. Display banners
                               3. Undo changes
                               :""");
        int choice = sc.nextInt();
        
        
        while(addMore.equalsIgnoreCase("y"))
        {
            switch (choice)
            {
                case 1 -> {
                        System.out.print("Please enter the text for the banner: ");
                        userText = sc.next();
                        if(!userText.isBlank())
                        {
                            banner.push(userText);
                            System.out.print("Would you like to add another line of text? (Y?N): ");
                            addMore = sc.next();
                        }
                        else
                        {
                            System.out.print("Please submit alphanumeric characters only!");
                        }
                }
                case 2 -> {
                    System.out.println("Your finished banner: ");
                    for(String s: banner)
                    {
                        System.out.println(banner.peek());
                    }
                }
                case 3 -> banner.pop();
                default -> System.out.print("You made an invalid selection! Try again: ");
            }
        }
        
        System.out.print("Your banner will display the following: ");
        for(String s : banner)
        {
            System.out.print(s + " ");
        }
    }
}

