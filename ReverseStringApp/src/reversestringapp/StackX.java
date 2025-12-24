package reversestringapp;

public class StackX {
    private char[] stackArray;
    private int top;
    private int arraySize;
    
    public StackX(int arraySize)
    {
        stackArray = new char[arraySize];
        top = -1;
        this.arraySize = arraySize;
    }
    
    public void push(char c)
    {
        stackArray[++top] = c;
    }
    
    public char pop()
    {
        return stackArray[top--];
    }
    
    public boolean isEmpty()
    {
        // If true, this will return -1
        return (top == -1);
    }
}
