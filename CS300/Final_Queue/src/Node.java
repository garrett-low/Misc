/**
 * @author Kuemmel
 * @param <T> the generic type of the data held by the Node
 */
public class Node<T> {

  private T data; // the data object stored by Nodes
  private Node<T> next; // a reference to the next node in the sequence

  /**
   * constructs a Node with a next field as input
   * 
   * @param data the data object stored by this node
   * @param next a reference to the next Node after this node
   */
  public Node(T data, Node<T> next) {
    this.data = data;
    this.next = next;
  }

  /**
   * constructs a Node with a next field of null
   * 
   * @param data the data object stored by this node
   */
  public Node(T data) {
    // implement this constructor using this
    this(data, null);
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public static void main(String[] args) {
    Node<String> node2 = new Node<String>("Stevie");
    Node<String> node1 = new Node<String>("Sam", node2);
    Node<String> node3 = new Node<String>("Pecca"); // Clash Royale character?
    
    // generate a Null Pointer Exception
    System.out.println(node2.data); // Stevie
    System.out.println(node2.next); // null
    // System.out.println(node2.next.data); // NullPointerException
    
    // try to mix types
    Node<Integer> int1 = new Node<Integer>(17);
    // int1.next = node3; // cannot convert from Node<String> to Node<Integer>
    // cannot mix generic types
    
    // auto-generate getters and setters
    
    // print out what name comes after node1
    System.out.println(node1.next.data); // Stevie
    System.out.println(node1.getNext()); // some memory address
    System.out.println(node1.getNext().getData()); // Stevie
    
    // set node3 as the head of the list
    node3.setNext(node1);
    
    // Write a while loop that iterates through the nodes and prints all names
    // very common practice for nodes. different from for loop with arrays
    System.out.println("\nprint all nodes in while loop:");
    Node<String> current = node3;
    while (current != null) {
      System.out.println(current.getData());
      current = current.getNext();
    }
    
    // Add a Node4 one between node1 and node2 (Sam and Stevie)
    Node<String> node4 = new Node<String>("Percy", node2);
    node1.setNext(node4);
    
    System.out.println("\nprint all nodes in while loop:");
    current = node3;
    while (current != null) {
      System.out.println(current.getData());
      current = current.getNext();
    }
        
    // Remove Node1 incorrectly
    // node1.setNext(null); // Pecca > Sam > NULL and Percy > Stevie
    
    // Remove Node1 correctly
    node3.setNext(node3.getNext().getNext()); // equivalent
    // node3.setNext(node4); // equivalent
    
    System.out.println("\nprint all nodes in while loop:");
    current = node3;
    while (current != null) {
      System.out.println(current.getData());
      current = current.getNext();
    }
    
    // TODO: Set all node reference variables to null except for the head

    // TODO: try something else


  }

}

