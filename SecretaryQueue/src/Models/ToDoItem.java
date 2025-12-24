package Models;
import java.util.LinkedList;

public class ToDoItem<T> {
    private LinkedList<T> toDoList = new LinkedList<>();
    
    public void enqueue(T item)
    {
        toDoList.addLast(item);
    }
    
    // Remove from queue
    public T dequeue()
    {
        return toDoList.removeFirst();
    }
    
    public int size()
    {
        return toDoList.size();
    }
    
    public T getFirstInQ()
    {
        return toDoList.peekFirst();
    }
    
    public T getLastInQ()
    {
        return toDoList.peekLast();
    }
    
    public T getAtPosition(int i)
    {
        return toDoList.get(i);
    }
}
