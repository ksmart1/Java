package arrayofobjects;

public class Employee implements Comparable {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String email;
    
    public Employee()
    {
        //Default constructor
    }
    
    public Employee(String employeeID, String firstName, String lastName,
            String email)
    {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public void setEmployeeID(String employeeID)
    {
        this.employeeID = employeeID;
    }
    
    public String getEmployeeID()
    {
        return this.employeeID;
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
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    @Override
    public int compareTo(Object o)
    {
        // Type cast generic Object type to Customer
        Employee e = (Employee) o;
        
        int sortResultStatus = this.getLastName().compareToIgnoreCase(e.getLastName());
        
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
