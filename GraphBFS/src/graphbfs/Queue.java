package graphbfs;

public class Queue {
    private int[] queArray;
    private int front;
    private int rear;
    private int SIZE = 20;
    
    public Queue() {}
    
    public Queue(int arraySize, int front, int rear)
    {
        this.queArray = new int[arraySize];

        front = 0;
        rear = -1;
    }
    
    public Queue(int size)
    {
        this.SIZE = size;
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }
    
    public void insert(int vIndex)
    {
        if(rear == (SIZE - 1))
        {
            rear = -1;
        }
        else
        {
            this.queArray[++rear] = vIndex;
        }
    }
    
    public int remove()
    {
        int temp = queArray[front++];
        
        if(front == SIZE)
        {
            front = 0;
        }
        
        return temp;
    }
    
    public boolean isEmpty()
    {
        return ((rear + 1) == front || (front + SIZE - 1) == rear);
    }
}
