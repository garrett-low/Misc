////////////////////ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           Node
// Files:           AsciiTest.java, AsciiArt.java, Canvas.java, DrawingChange.Java,
//                  DrawingStack.java, DrawingStackIterator.java, Node.java
// Course:          CS 300 Summer 2019
//
// Author:          Garrett Low
// Email:           grlow@wisc.edu
// Lecturer's Name: Andrew Kuemmel
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates, 
// strangers, and others do.  If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons:         N/A
// Online Sources:  N/A
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

// provided in assignment
/**
 * Node class for LinkedList for Stack<T>
 * @param <T> type of data of node
 */
public class Node<T> {
  private final T data;
  private Node<T> next;

  public Node(T element, Node<T> next) {
    this.data = element;
    this.next = next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public Node<T> getNext() {
    return this.next;
  }

  public T getData() {
    return this.data;
  }
}