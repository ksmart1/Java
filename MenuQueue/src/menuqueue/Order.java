package menuqueue;
import java.util.Queue;
import java.util.LinkedList;

public class Order {
    private Queue<String[]> order = new LinkedList<>();
//    private String item1, item2, item3, item4, item5, item6;
//    private String addItem;
//    private Order order;
    
    public Order()
    {
        // Default constructor
    }
    
    public Order(String[] order)
    {
        this.order.add(order);
    }
    
    public static void displayOrder(Queue<String[]> order)
    {
        System.out.println("Your order will be submitted to the kitchen.");
        System.out.println("Your complete order is: ");
        for (String[] orderArray : order) 
        {
            
            for (String item : orderArray)
            {
                if (item != null) 
                {
                    System.out.println(item);
                } 
                else 
                {
                    // If the item is null, it means the order has ended
                    break;
                }
            }
            // Print a separator between orders
            System.out.println("----------");
        }
    }
}
