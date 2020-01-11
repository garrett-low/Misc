
public class QueueArray implements QueueADT<Integer>{
  private int[] queueArray;
  private int head;
  private int tail;
  private int size;
  
  public QueueArray(int capacity) {
    this.queueArray = new int[capacity];
    this.head = -1;
    this.tail = -1;
    this.size = 0;
  }
  
  @Override
  /**
   * Insert at tail. If full, throw an Exception
   */
  public void enqueue(Integer newObject) {
    if (size >= queueArray.length) {
      throw new IllegalStateException();
    }
    
    if (this.isEmpty()) { // start here
      tail++; // could also do queueArray[++tail] = newObject;
      head++;
    } else if (tail + 1 < queueArray.length) { // general case - add to next index
      tail++; // could also do queueArray[++tail] = newObject; 
    } else { // wrap-around // tail + 1 == queueArray.length
      tail = 0;
      // could also do queueArray[tail] = newObject;
    }
    queueArray[tail] = newObject; // set tail
    size++;
  }

  @Override
  /**
   * remove at head and return
   * if queue is empty, throw an Exception
   */
  public Integer dequeue() {
    if (this.isEmpty()) {
      throw new IllegalArgumentException();
    }
    
    int temp = queueArray[head]; // removed head to return
    if (head == tail) { // size == 1, then reset array
      head = -1;
      tail = -1;
    } else if (head + 1 < queueArray.length) { // general case - increment head
      head++;
    } else { // wrap-around // head+1 == queueArray.length
      head = 0;
    }
    size--;
    
    return temp;
  }

  @Override
  /**
   * get first item, but don't remove
   * if queue is empty, throw an Exception
   */
  public Integer peek() {
    if (this.isEmpty()) {
      throw new IllegalArgumentException();
    }
    
    return queueArray[head];
  }

  @Override
  public boolean isEmpty() {
    return head == -1 || tail == -1;
  }
  
  @Override
  public String toString() { 
    String temp = "";
    for (int i = 0; i < queueArray.length; i++) {
      temp += String.valueOf(queueArray[i]) + " ";
    }
    return temp;
  }
  
}
