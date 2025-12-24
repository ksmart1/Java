package reversestringapp;

public class ReverseStringApp {

    public static void main(String[] args) {
        String inputString = "This is my input string.";
        
        Reverser reverser = new Reverser(inputString);
        String reversed = reverser.doReverse();
        
        System.out.println("Original string = " + inputString);
        System.out.println("Reversed string = " + reversed);
    }
    
}
