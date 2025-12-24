package ordersinterface;
import java.util.LinkedList;
import java.util.Queue;

public class GroceryOrder<E> implements IOrder<E>  {
    private Queue<E> order = new LinkedList<>();
    
    public GroceryOrder()
    {
        // Default constructor
    }
    
    @Override
    public void addItem(E item)
    {
        order.add(item);
    }
    
    @Override
    public int orderSize()
    {
        return this.order.size();
    }
    
    @Override
    public void displayOrder()
    {
        if(this.order.peek() instanceof java.lang.String || 
           this.order.peek() instanceof java.lang.Integer ||
           this.order.peek() instanceof java.lang.Float ||
           this.order.peek() instanceof java.lang.Double)
        {
            System.out.println("Grocery Order: " );
            
            for(E item : order)
            {
                System.out.print(item + " ");
                
            }
        }
    }
    
    @Override
    public boolean isEmpty()
    {
        if(order.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
