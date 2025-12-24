package genericlinkedlist;

public class Link<T> {
    public T data; 
    public Link<T> next; 

    public Link(T data) {
        this.data = data;
    }

    public void displayLink() {
        System.out.print(data.toString() + " ");
    }
}
