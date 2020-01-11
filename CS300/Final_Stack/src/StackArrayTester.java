public class StackArrayTester {

  public static boolean testStackPushPeek() {
    StackArray myStack = new StackArray(3);
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    int peekChange = myStack.peek();
    
    if (peekChange != 2) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testStackPop() {
    StackArray myStack = new StackArray(3);
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    int myPop = myStack.pop();
    
    if (myPop != 2) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testStackIsEmpty() {
    StackArray myStack = new StackArray(3);
    myStack.push(0);
    myStack.pop();
    
    if (!myStack.isEmpty()) {
      return false;
    }
    
    return true;
  }
  
  public static boolean testStackSize() {
    StackArray myStack = new StackArray(3);
    myStack.push(0);
    myStack.push(1);
    myStack.push(2);
    
    if (myStack.size() != 3) {
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
    } else {
      return true;
    }
  }
  
  public static void main(String[] args) {
    //System.out.println("testStackPushPeek(): " + testStackPushPeek());
    runStackTestSuite();
  }
}
