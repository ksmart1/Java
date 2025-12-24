package singletonpattern;

public class SingleObject {
    private static SingleObject instance = new SingleObject();
    
    // Private prevents instantiating new object in main method
    private SingleObject()
    {
        
    }
    
    public static SingleObject getInstance()
    {
        return instance;
    }
    
    public void showMessage()
    {
        System.out.println("Singleton example!");
    }
}
