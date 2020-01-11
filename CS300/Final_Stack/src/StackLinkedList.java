import java.util.EmptyStackException;
import java.util.Iterator;

public class StackLinkedList<T> implements StackADT<T>, Iterable<T> {
  private Node<T> top;
    
  @Override
  public void push(T element) throws IllegalArgumentException {
    if (element == null) {
      throw new IllegalArgumentException("Object to add is null");
    }
    
    // create new node and set its next to the stack's current top
    // then, set new node as top
    Node<T> newNode = new Node<T>(element, top);
    top = newNode;
  }

  @Override
  public T pop() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }
    Node <T> temp = top; // store top in temp before changing top
    top = top.getNext();
    
    return temp.getData();
  }

  @Override
  public T peek() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }
    return top.getData();
  }

  @Override
  public boolean isEmpty() {
    return top == null;
  }

  @Override
  public int size() {
    int size = 0;
    for (T e : this) {
      size++;
    }
    return size;
  }

  @Override
  public Iterator<T> iterator() {
    return new StackLinkedListIterator<T>(top);
  }
}
