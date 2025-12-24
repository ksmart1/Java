package stacklinklistbuiltin;
import java.util.LinkedList;

public class myStack<E> implements IStack<E> {
    private LinkedList<E> list = new LinkedList<>();
    
    @Override
    public void push(E item)
    {
        list.addFirst(item);
    }
    
    @Override
    public Object pop()
    {
        return list.removeFirst();
    }
    
    @Override
    public Object peek()
    {
        return list.getFirst();
    }
    
    @Override
    public int size()
    {
        return list.size();
    }
    
    @Override
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    public void displayStack()
    {
        System.out.println("Stack Content:");
        
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
    
    public Object getSpecificStackItem(int index)
    {
        return list.get(index);
    }
}
