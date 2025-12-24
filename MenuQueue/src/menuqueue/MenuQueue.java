package menuqueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class MenuQueue {
    
    static Queue<String[]> order = new LinkedList<>();

    public static void main(String[] args) {
        // Create menu for order entry
        Scanner sc = new Scanner(System.in);
        boolean sentinel = true;
        
        do
        {
            displayMenu();
            System.out.print("How can we serve you today?: ");
            int menuOption = sc.nextInt();

            switch(menuOption)
            {
                case 1 -> { 
                    orderMenu();
                    break;
                }
                case 2 -> { 
                    Order.displayOrder(order);
                    sentinel = false;
                    break;
                }
                case 3 -> {
                    System.out.println("Goodbye!");
                    sentinel = false;
                    break;
                }
                default -> {
                    System.out.print("Please enter a valid menu choice (1-3): ");
                    break;
                }
            }
        } while(sentinel);
    }
    
    // Welcome menu
    public static void displayMenu()
    {
        System.out.println("Welcome to the ITS340 Cafe!");
        System.out.println("""
                            1. Order Meal
                            2. Checkout
                            3. Leave/Cancel
                           """);
        
    }
    
    // Menu for placing an order
    public static void orderMenu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                            ###### Menu ######
                            1. Chicken Plate
                            2. Steak Plate
                            3. BBQ Plate
                            4. Fish Plate
                            5. Pork Plate
                            6. Vegetable Plate
                            7. Go to Main Menu""");
        System.out.print("Which entree would you like?: ");
        int entree = sc.nextInt();
        String orderMeal = "";
        
        switch(entree)
        {
            case 1 -> { orderMeal = "Chicken Plate"; }
            case 2 -> { orderMeal = "Steak Plate";     }
            case 3 -> { orderMeal = "BBQ Plate";       }
            case 4 -> { orderMeal = "Fish Plate";      }
            case 5 -> { orderMeal = "Pork Plate";      }
            case 6 -> { orderMeal = "Vegetable Plate"; }
            case 7 -> { displayMenu();                 }
            default -> { System.out.print("Please "
                    + "enter a valid number!");        }
        }
        createOrder(orderMeal);
    }
    
    // Order entry function
    public static void createOrder(String entree)
    {
        Scanner sc = new Scanner(System.in);
        
        // Array to hold order of up to 6 items
        String[] orderArray = new String[6];
        orderArray[0] = entree;
        
        // Prompt user for sides
        System.out.println("What would you like with your " + entree + "?");
        System.out.println("Please enter up to 5 additional items, one at a time.");
        String addtlItem = "y";
        
        while(!addtlItem.equalsIgnoreCase("x"))
        {
            for(int i=1; i<6; i++)
            {
                // Customer enters side items for order
                System.out.print("Side item or X to finish meal order: ");
                addtlItem = sc.nextLine();
                
                if(!addtlItem.equalsIgnoreCase("x"))
                {
                    // User entered anything other than just "x"
                    orderArray[i] = addtlItem;
                }
                else
                {
                    // User enters "x" to end order. Set i to 6 to exit loop
                    i = 6;
                }
            }
        }
            
        // Add order array to order queue
        order.add(orderArray);
    }
}
