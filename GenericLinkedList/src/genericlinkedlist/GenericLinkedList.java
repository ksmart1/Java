package genericlinkedlist;
import java.util.*;

public class GenericLinkedList {

    public static void main(String[] args) {
        // Lab 5 Question 3
        LinkedList<Integer> intList = new LinkedList<>();
        intList.insertFirst(10);
        intList.insertFirst(20);
        intList.insertFirst(30);
        intList.displayList();

        LinkedList<Person> personList = new LinkedList<>();
        personList.insertFirst(new Person("John", "Doe", 30));
        personList.insertFirst(new Person("Alice", "Smith", 25));
        personList.displayList();

        LinkedList<Book> bookList = new LinkedList<>();
        bookList.insertFirst(new Book("978-0135166307", "Java: A Beginner's Guide", "McGraw-Hill"));
        bookList.insertFirst(new Book("978-0134685991", "Effective Java", "Addison-Wesley"));
        bookList.displayList();
        
    }
}
