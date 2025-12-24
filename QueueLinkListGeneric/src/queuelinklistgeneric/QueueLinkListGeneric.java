package queuelinklistgeneric;

public class QueueLinkListGeneric {

    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Person1");
        queue.enqueue("Person2");
        queue.enqueue("Person3");
        queue.enqueue("Person4");
        
        //displayQ(queue);
        queue.displayQueue();
        
        GenericQueue<Integer> queue2 = new GenericQueue<>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.enqueue(4);
        queue2.enqueue(5);
        queue2.enqueue(6);
        queue2.enqueue(7);
        
        GenericQueue<Student> queue3 = new GenericQueue<>();
        queue3.enqueue(new Student("1234", "John", "Doe"));
        queue3.enqueue(new Student("2345", "Jane", "Smith"));
        queue3.enqueue(new Student("5678", "Jeff", "Jefferies"));
        queue3.displayQueue();
        queue3.processQ();
        queue3.displayQueue(); // Now a totally empty queue
    }
    
    public static void displayQ(GenericQueue<String> q)
    {
        System.out.println();
        for(int i=0; i<q.size(); i++)
        {
            System.out.print(q.getAtPosition(i) + " ");
        }
    }
    
}
