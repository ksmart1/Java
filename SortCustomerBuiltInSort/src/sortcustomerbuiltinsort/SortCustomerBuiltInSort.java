package sortcustomerbuiltinsort;

import java.util.Arrays;

public class SortCustomerBuiltInSort {

    public static void main(String[] args) {
        
        Customer customers[] = new Customer[3];
        customers[0] = new Customer("1234", "john@yahoo.com", 
                "John", "Doe");
        customers[1] = new Customer("7645", "dave@yahoo.com", 
                "Dave", "Jones");
        customers[2] = new Customer("2354", "zane@yahoo.com", 
                "Zane", "Williams");
        
        Arrays.sort(customers);
        
        for(Customer c : customers)
        {
            System.out.print("ID: " + c.getCustomerID() + ", " +
                    c.getEmail() + ", " + c.getFirstName() + ", " +
                    c.getLastName());
            System.out.println();
        }
    }
    
}
