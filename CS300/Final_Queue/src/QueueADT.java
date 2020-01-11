public interface QueueADT<T> {
  public void enqueue(T newObject); // insert at back. If full, resize or throw an Exception

  public T dequeue(); // remove at front and return

  public T peek(); // get first item, but don't remove
                   // for dequeue and peek, if queue is empty
                   // either throw an Exception or return null

  public boolean isEmpty();
}
