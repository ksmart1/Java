package arrayofobjects;
import java.util.*;

public class ArrayOfObjects {

    public static void main(String[] args) {
        Employee employees[] = new Employee[3];
        
        Scanner sc = new Scanner(System.in);
        
        int i = 0;
        while(i < 3)
        {
            System.out.print("Enter the EmployeeID: ");
            String empID = sc.nextLine();
            System.out.print("Enter employee first name: ");
            String first = sc.nextLine();
            System.out.print("Enter employee last name: ");
            String last = sc.nextLine();
            System.out.print("Enter employee email: ");
            String email = sc.nextLine();
            employees[i]  = new Employee(empID, first, 
                    last, email);
            i++;
        }
        System.out.println();
        
        Arrays.sort(employees);
        
        for (Employee emp : employees)
        {
            System.out.println("EmployeeID: " + emp.getEmployeeID());
            System.out.println("Name: " + emp.getFirstName() + " " +
                    emp.getLastName());
            System.out.println("Email Address: " + emp.getEmail());
            System.out.println();
        }
    }
    
}
