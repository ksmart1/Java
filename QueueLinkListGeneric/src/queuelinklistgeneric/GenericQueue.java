package queuelinklistgeneric;
import java.util.LinkedList;

public class GenericQueue<T>  {
    private LinkedList<T> list = new LinkedList<>();
    
    // Add to Queue
    public void enqueue(T item)
    {
        list.addLast(item);
    }
    
    // Remove from queue
    public T dequeue()
    {
        return list.removeFirst();
    }
    
    public int size()
    {
        return list.size();
    }
    
    public T getFirstInQ()
    {
        return list.peekFirst();
    }
    
    public T getLastInQ()
    {
        return list.peekLast();
    }
    
    public T getAtPosition(int i)
    {
        return list.get(i);
    }
    
    public void displayQueue()
    {
        System.out.println("Elements in queue: ");
        for(int i=0; i<list.size(); i++)
        {
            Object o = getAtPosition(i);
            if(o instanceof java.lang.String)
            {
                System.out.println(list.get(i) + " ");
            }
            else if(o instanceof java.lang.Integer)
            {
                Integer sum = 0;
                sum = (Integer) list.get(i);
                System.out.println(list.get(i) + " ");
                System.out.println("Running sum is: " + sum);
            }
            else if(o instanceof Student)
            {
                Student s = (Student) o;
                s.displayStudent();
            }
            
        }
    }
    
    public void displayQStrings(GenericQueue<String> s)
    {
        
    }
    
    public void processQ()
    {
        System.out.println();
        while(!list.isEmpty())
        {
            Object o = getFirstInQ();
            if(o instanceof java.lang.String)
            {
                System.out.println("\nItem processes is string " +
                        dequeue() + " ");
            }
            else if(o instanceof java.lang.Integer)
            {
                System.out.println("Item processes is an integer " +
                        dequeue() + " ");
            }
            else if(o instanceof Student)
            {
                Object obj = dequeue();
                Student s = (Student) obj;
                System.out.println("Item process is a Student: " + 
                        s.getFullName() + " with StudentID: " +
                        s.getStudentID());
            }
        }
    }
}
