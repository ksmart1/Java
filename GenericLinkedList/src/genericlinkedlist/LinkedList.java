package genericlinkedlist;

public class LinkedList<T> {
    private Link<T> first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(T data) {
        Link<T> newLink = new Link<T>(data);
        newLink.next = first;
        first = newLink;
    }
    
    public Link<T> find(T key) {
        Link<T> current = first;
        while (current != null && !current.data.equals(key))
            current = current.next;
        return current;
    }

    // Additional methods for demonstration
    public void displayList() {
        System.out.print("List (first-->last): ");
        Link<T> current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
