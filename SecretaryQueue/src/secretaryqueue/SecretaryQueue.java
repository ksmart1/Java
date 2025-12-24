package secretaryqueue;
import java.util.Queue;
import java.util.Scanner;
import Models.*;

public class SecretaryQueue {

    public static void main(String[] args) {
        // Queue of to-do items for a secretary
        Scanner sc = new Scanner(System.in);
        final int QUIT = 999;
        boolean sentinel = true;
        String userEntry = "";
        ToDoItem<String> toDo = new ToDoItem<>();
        
        do
        {
            System.out.print("Please enter a task or enter QUIT: ");
            userEntry = sc.nextLine();
            toDo.enqueue(userEntry);
            
        }while(!userEntry.equalsIgnoreCase("quit"));
        
        while(sentinel)
        {
            System.out.print("Would you like to receive the next task? (Y/N): ");
            String response = sc.nextLine();
            if(response.equalsIgnoreCase("y"))
            {
                String task = toDo.dequeue();
                System.out.println("Task: " + task);
            }
            else
            {
                System.out.println("You're fired. Goodbye.");
                sentinel = false;
            }
        }
        
    }
    
}
