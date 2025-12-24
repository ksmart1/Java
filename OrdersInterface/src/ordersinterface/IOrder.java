package ordersinterface;

public interface IOrder<E> {
    void addItem(E item);
    int orderSize();
    void displayOrder();
    boolean isEmpty();
}
