class Box<E> implements IBox<E> {
  
  E item;
  boolean isEmpty = true;
  
  Box() {}
  
  public boolean put(E item) {
    if (!isEmpty) {
      return false;
    }
    
    this.item = item;
    this.isEmpty = false;
    return true;
  }
  
  public E take() throws Exception {
    if (isEmpty) {
      throw new Exception("Box is empty!");
    }
    
    this.isEmpty = true;
    return this.item;
  }
  
  public boolean isEmpty() {
    return isEmpty;
  }
}