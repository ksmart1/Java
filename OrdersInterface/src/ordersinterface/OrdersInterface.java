package ordersinterface;
import java.util.LinkedList;

public class OrdersInterface {

    public static void main(String[] args) {
        GroceryOrder<String> groceries = new GroceryOrder<>();
        FoodOrder<String> foodOrder = new FoodOrder<>();
        
        // Instantiating generic GroceryOrder
        GroceryOrder groceries2 = new GroceryOrder();
        
        // Random data types to be stored in GroceryOrder
        int x = 314;
        groceries2.addItem(x);
        String s = "words";
        groceries2.addItem(s);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(200);
        list.add(100);
        list.add(300);
        groceries2.addItem(list);
        
        //System.out.print(groceries2.getClass());
        
        // Add 6 items to GroceryOrder
        groceries.addItem("bananas,");
        groceries.addItem("milk,");
        groceries.addItem("eggs,");
        groceries.addItem("cheese,");
        groceries.addItem("turkey,");
        groceries.addItem("bread");
        
        // Add 6 items to FoodOrder
        foodOrder.addItem("8oz sirloin,");
        foodOrder.addItem("baked sweet potato,");
        foodOrder.addItem("caesar salad,");
        foodOrder.addItem("cheesecake,");
        foodOrder.addItem("sweet tea,");
        foodOrder.addItem("bloomin' onion");
        
        // Run each class through the inherited methods from IOrder
        
        // Testing orderSize()
        System.out.println("There are " + groceries.orderSize() + " groceries"
                            + " in the order.");
        
        // Testing isEmpty() prior to displayOrder()
        if(!groceries.isEmpty())
        {
            groceries.displayOrder();
        }
        else
        {
            System.out.println("GroceryOrder is empty!");
        }
        
        System.out.println();
        
        // Testing orderSize()
        System.out.println("There are " + foodOrder.orderSize() + " items"
                            + " in the food order.");
        
        // Testing isEmpty() prior to displayOrder()
        if(!foodOrder.isEmpty())
        {
            foodOrder.displayOrder();
        }
        else
        {
            System.out.println("FoodOrder is empty!");
        }
        
        if(!groceries2.isEmpty())
        {
            groceries2.displayOrder();
        }
        else
        {
            System.out.println("GroceryOrder is empty!");
        }
    }
    
}
