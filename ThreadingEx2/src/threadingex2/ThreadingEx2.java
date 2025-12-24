package threadingex2;

public class ThreadingEx2 extends Thread {
    public static int amount = 0;
    
    public static void main(String[] args) {
        // Rather than implementing Runnable, we are extending Thread
        // Create reference for thread
        ThreadingEx2 thread = new ThreadingEx2();
        thread.start();
        System.out.println("Amount: " + amount);
        amount++;
        System.out.println("Amount: " + amount);
        
    }
    
    public void run()
    {
        amount++;
    }
}
