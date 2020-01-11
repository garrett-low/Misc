import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Iterator implementation for Stack
 * 
 * @param type of element returned by this Iterator
 */
public class StackLinkedListIterator<T> implements Iterator<T> {
  Node<T> current; // reference to the current element in the iteration

  /**
   * Creates a Iterator that iterates over a linked list of elements of type T
   * 
   * @param head reference to the first node in the iteration
   */
  public StackLinkedListIterator(Node<T> head) {
    this.current = head;
  }
  
  // Override abstract methods defined in Iterator<T>
  @Override
  public boolean hasNext() {
    return current != null;
  }

  @Override
  public T next() {
    if(!this.hasNext()){
      throw new NoSuchElementException();
    }
    T temp = current.getData(); // store data in temp variable before changing current
    current = current.getNext();
    
    return temp;
  }

}
