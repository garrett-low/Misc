import java.util.EmptyStackException;

public class StackArray {
  private int[] stackArray;
  private int top;
  
  public StackArray(int capacity) {
    this.stackArray = new int[capacity];
    this.top = -1;
  }

  public void push(int element) {   
    if (top + 1 < stackArray.length) {
      stackArray[++top] = element;
    } else {
      throw new IllegalStateException(); // array is full
    }
  }

  public int pop() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }
    
    return stackArray[top--];
  }
  
  public int peek() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }
    
    return stackArray[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public int size() {
    return top+1;
  }

}