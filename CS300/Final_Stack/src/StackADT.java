import java.util.Iterator;

/**
 * Stack Abstract Data Type<br>
 * CS 300 P8 Assignment
 * 
 * @author Mingi and Kuemmel
 *
 * @param <T> the type of objects to be stored in this stack
 */
public interface StackADT<T> {
  /**
   * Add an element to this stack
   * @param element an element to be added
   * @throws IllegalArgumentException if the input element is null
   */
  public void push(T element) throws IllegalArgumentException;

  /**
   * Remove the element on the stack top and return it
   * @return the element removed from the stack top
   * @throws EmptyStackException if stack is empty
   */
  public T pop();

  /**
   * Get the element on the stack top
   * @return the element on the stack top
   * @throws EmptyStackException if stack is empty
   */
  public T peek();

  /**
   * Returns true if this stack contains no elements.
   * @return true if this stack contains no elements, otherwise false
   */
  public boolean isEmpty();

  /**
   * Get the number of elements in the stack
   * @return the size of the stack
   */
  public int size();

  /**
   * 
   * @return iterator of the stack
   */
  public Iterator<T> iterator();
}