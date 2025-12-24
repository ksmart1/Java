package sortcustomerbuiltinsort;

// Class implenting an interface

public class Customer implements Comparable {
    private String customerID;
    private String email;
    private String firstName;
    private String lastName;
    
    public Customer()
    {
        
    }
    
    public Customer(String customerID, String email, String firstName, String lastName)
    {
        this.customerID = customerID;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void setCustomerID(String customerID)
    {
        this.customerID = customerID;
    }
    
    public String getCustomerID()
    {
        return this.customerID;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
     
    @Override
    public int compareTo(Object o)
    {
        // Type cast generic Object type to Customer
        Customer c = (Customer) o;
        
        int sortResultStatus = this.getCustomerID().compareToIgnoreCase(c.getCustomerID());
        
        if (sortResultStatus < 0)
        {
            return -1;
        }
        else if (sortResultStatus > 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
