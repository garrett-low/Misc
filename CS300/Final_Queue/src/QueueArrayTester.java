
public class QueueArrayTester {
  public static boolean testEnqueuePeek() {
    QueueArray myQueue = new QueueArray(3);
    myQueue.enqueue(1);
    int myPeek = myQueue.peek();
    
    if (myPeek != 1) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testDequeue() {
    QueueArray myQueue = new QueueArray(3);
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    int myDequeue = myQueue.dequeue();
    
    if (myDequeue != 1) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testWrapAround() {
    QueueArray myQueue = new QueueArray(3);
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    myQueue.dequeue(); // out 1
    myQueue.enqueue(4);
    myQueue.dequeue(); // out 2
    myQueue.dequeue(); // out 3
    int myWrapAround = myQueue.dequeue(); // out 4
    
    if (myWrapAround != 4) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testIsEmpty() {
    QueueArray myQueue = new QueueArray(3);
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
    System.err.println("testWrapAround(): " + testWrapAround());
    System.err.println("testIsEmpty(): " + testIsEmpty());
  }

}
