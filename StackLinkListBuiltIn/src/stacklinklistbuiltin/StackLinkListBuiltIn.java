package stacklinklistbuiltin;

public class StackLinkListBuiltIn {

    public static void main(String[] args) {
        // Implementing a class with push, pop, and peek methods
        myStack<String> stack1 = new myStack();
        
        // Add items to the stack using the push operation
        stack1.push("BMW");
        stack1.push("Volvo");
        stack1.push("Ford");
        stack1.push("Chevrolet");
        
        //stack1.displayStack();
        displayMyStack(stack1);
        
        // Peek at what is next in the stack
        Object o = stack1.peek();
        System.out.println("\nNext in the stack is: " + (String) o);
        Object poppedObject = stack1.pop();
        System.out.println("\nPopped object is: " + (String) poppedObject);
        displayMyStack(stack1);
        processStack(stack1);
    }
    
    public static void processStack(myStack s)
    {
        System.out.println("\nProcessing entire stack:");
        
        while(s.size() > 0)
        {
            if(s.peek() instanceof java.lang.String)
            System.out.println((String) s.pop() + " ");
        }
        
    }
    
    public static void displayMyStack(myStack s)
    {
        System.out.println("Displaying stack using custom display:");
        
        for(int i=0; i<s.size(); i++)
        {
            if (s.getSpecificStackItem(i) instanceof java.lang.String)
            {
                System.out.print(s.getSpecificStackItem(i) + " ");
            }
            else if (s.getSpecificStackItem(i) instanceof java.lang.Double)
            {
                //Add print statment
            }
            else 
            {
                //Add print statement
            }
            
        }
    }
}
