package comparedecimals;

public class CompareDecimals {

    public static void main(String[] args) {
        // Compare two decimal numbers may be a problem because 
        // they may not be exact to each other. 
        // Decimal numbers with fractional parts cannot store
        // an infinite number of digits - some roundoff will
        // happen (i.e. 2.00000000000004). Therefore, when comparing 
        // to decimal numbers with fractional parts, check it they
        // are "close" to one another based on some "closeness"
        // value such as Epsilon.
        
        double original = 2;
        double sqrtRoot = Math.sqrt(original);
        double rootSquared = sqrtRoot * sqrtRoot;
        final double EPSILON = 1E-12;
        
        System.out.println("Original: " + original);
        System.out.println("Processed number: " + rootSquared);
        
        if (Math.abs(rootSquared - original) < EPSILON)
        {
            System.out.println("The numbers are the same.");
        }
        else
        {
            System.out.println("The numbers are not the same.");
        }
    }
    
}
