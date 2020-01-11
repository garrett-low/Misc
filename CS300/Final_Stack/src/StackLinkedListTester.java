import java.util.Iterator;

public class StackLinkedListTester {
  public static boolean testStackPushPeek() {
    StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    Integer peekChange = myStack.peek();
    
    if (peekChange != 2) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testStackPop() {
    StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    Integer myPop = myStack.pop();
    
    if (myPop != 2) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testStackIsEmpty() {
    StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();
    myStack.push(0);
    myStack.pop();
    
    if (!myStack.isEmpty()) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testStackSize() {
    StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    
    if (myStack.size() != 3) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testStackIterator() {
    StackLinkedList<Integer> myStack = new StackLinkedList<Integer>();
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    Iterator<Integer> myIterator = myStack.iterator();
    
    Integer next = myIterator.next();
    if (next != 2) {
      return false;
    }
    
    return true;
  }
  
  public static boolean runStackTestSuite() {
    if (!testStackPushPeek()) {
      System.out.println("testStackPushPeek(): FAILED");
      return false;
    } else if (!testStackPop()) {
      System.out.println("testStackPop(): FAILED");
      return false;
    } else if (!testStackIsEmpty()) {
      System.out.println("testStackIsEmpty(): FAILED");
      return false;
    } else if (!testStackSize()) {
      System.out.println("testStackSize(): FAILED");
      return false;
    } else if (!testStackIterator()) {
      System.out.println("testStackIterator(): FAILED");
      return false;
    } else {
      return true;
    }
  }
  
  public static void main(String[] args) {
    System.out.println("testStackPushPeek(): " + testStackPushPeek());
    System.out.println("testStackPop(): " + testStackPop());
    System.out.println("testStackIsEmpty(): " + testStackIsEmpty());
    System.out.println("testStackSize(): " + testStackSize());
    System.out.println("testStackIterator(): " + testStackIterator());
    
  }

}
