package stacklinklistbuiltin;

public interface IStack<E> {
    // Utilizing generics. Can use T or E. Must add in implements/extends
    // area of the class ^^^
    public void push(E item);
    public Object pop();
    public Object peek();
    public int size();
    public boolean isEmpty();
}
