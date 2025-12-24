package javastack;
import java.util.*;

public class JavaStack {

    public static void main(String[] args) {
        // Using built-in Java Stack class requires util
        
        Stack<String> myStack = new Stack<>();
        myStack.push("BMW");
        myStack.push("Subaru");
        myStack.push("Honda");
        myStack.push("Pagani");
        
        System.out.println(myStack);
        
        // Removes item from the stack
        String popped = myStack.pop();
        
        // Getting dropped item information
        System.out.println("Popped item: " + popped);
        
        // Checking stack after pop
        System.out.println(myStack);
        System.out.println("Number of items in stack is: " + myStack.size());
        
        // Stack with mixed data types. 
        Stack myStack2 = new Stack();
        myStack2.push("This is a string.");
        myStack2.push(10);
        myStack2.push('A');
        myStack2.push(20);
        
        int sum = 0;
        while(!myStack2.isEmpty())
        {
            Object o = myStack2.pop();
            if(o instanceof java.lang.Integer)
            {
                sum = sum + (Integer) o;
            }
        }
        
        System.out.println("Stack sum: " + sum);
        System.out.println(myStack2.isEmpty());
    }
    
}
