package threadsample1;

public class ThreadSample1 implements Runnable {

    public static void main(String[] args) {
        // Instantiate new thread
        ThreadSample1 obj = new ThreadSample1();
        Thread thread2 = new Thread(obj);
        thread2.start();
        System.out.println("This code is outside of the 2nd thread!");
    }
    
    public void run()
    {
        System.out.println("This code is running in the new thread!");
    }
    
}
