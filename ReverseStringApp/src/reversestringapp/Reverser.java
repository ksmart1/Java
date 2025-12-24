package reversestringapp;

public class Reverser {
    private String input;
    private String output;
    
    public Reverser(String input)
    {
        this.input = input;
    }
    
    public String doReverse()
    {
        // Determine arraySize and initialize stack
        int stringSize = input.length();
        StackX myStack = new StackX(stringSize);
        char c;
        
        // Loading the array one char at a time
        for(int i=0; i<stringSize; i++)
        {
            c = input.charAt(i);
            myStack.push(c);
        }
        
        // Assembling output string
        output = "";
        while(!myStack.isEmpty())
        {
            c = myStack.pop();
            output = output + c;
        }
        
        return output;
    }
}
