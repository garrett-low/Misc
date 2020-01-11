/**
 * Describes a Generic Abstract Data Type
 * 
 * @author Andy Kuemmel
 * @param <T> represents the Type of the elements of the list
 */
interface ListADT<T> {
  /**
   * adds element of type T at the end of the list
   * 
   * @param element the object to be added
   */
  public void add(T element);

  /**
   * adds element at given index position, subsequent elements moved down
   * 
   * @param index   the index of the new object
   * @param element
   * @throws IndexOutOfBoundsTxception if index < 0 or index >= size
   */
  public void add(int index, T element) throws IndexOutOfBoundsException;


  /**
   * @return the number of elements in the list
   */
  public int size();


  /**
   * This method returns the index of the first element of the list whose equals method matches with
   * target
   * 
   * @param findObject
   * @return the index of target in the list if found, or -1 if not found
   */
  public int indexOf(T target);


  /**
   * @param index
   * @return the element of the list at the given index
   * @throws IndexOutOfBoundsException if index < 0 or index >= size
   */
  public T get(int index) throws IndexOutOfBoundsException;


  /**
   * This method removes the item from the list that has the given index and returns it
   * 
   * @param index
   * @return the removed item or null if not found
   * @throws IndexOutOfBoundsException if index < 0 or index >= size
   */
  public T remove(int index) throws IndexOutOfBoundsException;

}

