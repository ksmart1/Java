package singletonpattern;

public class SingletonPattern {

    public static void main(String[] args) {
        
        // Return instance of SingleObject
        SingleObject object = SingleObject.getInstance();  // Good for sharing data between classes
        
    }
    
}
