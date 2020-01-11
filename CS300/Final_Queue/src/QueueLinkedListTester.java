
public class QueueLinkedListTester {
  
  public static boolean testEnqueuePeek() {
    QueueLinkedList<Integer> myQueue = new QueueLinkedList<Integer>();
    myQueue.enqueue(1);
    int myPeek = myQueue.peek();
    
    if (myPeek != 1) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testDequeue() {
    QueueLinkedList<Integer> myQueue = new QueueLinkedList<Integer>();
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    int myDequeue = myQueue.dequeue();
    
    if (myDequeue != 1) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testIsEmpty() {
    QueueLinkedList<Integer> myQueue = new QueueLinkedList<Integer>();
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.dequeue();
    myQueue.dequeue();
    myQueue.dequeue();
    boolean myEmpty = myQueue.isEmpty();
    
    if (myEmpty != true) {
      return false;
    }
    
    return true;
  }

  public static void main(String[] args) {
    System.err.println("testEnqueuePeek(): " + testEnqueuePeek());
    System.err.println("testDequeue(): " + testDequeue());
    System.err.println("testIsEmpty(): " + testIsEmpty());
  }
}
