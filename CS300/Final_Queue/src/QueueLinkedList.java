/**
 * Implement queue as linked list
 * Can be any size
 * Enqueue to tail, dequeue from head
 * 
 * @author Garrett
 *
 * @param <T> queue can store object of any type T
 */
public class QueueLinkedList<T> implements QueueADT<T> {
  private Node<T> head;
  private Node<T> tail;
  
  public QueueLinkedList() {
    this.head = null;
    this.tail = null;
  }
  
  @Override
  public void enqueue(T newObject) {
    Node<T> n = new Node<T>(newObject);
    if (isEmpty()) {
      head = n;
      tail = n;
    } else {
      tail.setNext(n); // point current tail to new tail
      tail = n; // set new tail for linked list
    }
    n = null;
  }

  @Override
  public T dequeue() {
    if (this.isEmpty()) {
      throw new IllegalArgumentException();
    }
    
    T temp = head.getData();
    head = head.getNext(); // set new head to next node behind head
    
    return temp;
  }

  @Override
  public T peek() {
    if (this.isEmpty()) {
      throw new IllegalArgumentException();
    }
    
    return head.getData();
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }
  
  @Override
  public String toString() {
    if (this.isEmpty()) {
      return "";
    }
    
    StringBuilder result = new StringBuilder();
    Node<T> currNode = head;
    while (currNode != null) {
      result.append(String.valueOf(currNode.getData()));
      currNode = currNode.getNext();
    }
    return result.toString();
  }

}
