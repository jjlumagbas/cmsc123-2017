class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  // add front
  public boolean add(GroceryItem item) {
    GroceryNode newNode = new GroceryNode(item, this.head);
    this.head = newNode;
    this.size++;
    return true;
  }
  
  public boolean remove(String name) {
    if (this.size == 0) {  // empty list
      return false;
    }
    
    GroceryItem that = new GroceryItem(name, 0);
    
    GroceryNode prev = head;
    GroceryNode curr = head.next;
    
    if (prev.data.equals(that)) { // remove first element
      this.head = curr;
      prev.next = null;
        
      size--;
      return true;
    }  
    
    while (curr != null) { // remove other than first element
      
      if (curr.data.equals(that)) {
        prev.next = curr.next;
        curr.next = null;
        
        size--;
        return true;
      }
      
      curr = curr.next;
      prev = prev.next;
    }
    
    return false;
  }
  
  public boolean markAsBought(String name) {
    GroceryItem that = new GroceryItem(name, 0);
    
    GroceryNode curr = head;
    while (curr != null) {
      
      if (curr.data.equals(that)) {
        curr.data.markAsBought();
        return true;
      }
      
      curr = curr.next;
    }
    return false;
  }
  
  public void display() {
    GroceryNode curr = head;
    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }
  
  class GroceryNode {
    GroceryItem data;
    GroceryNode next;
    
    GroceryNode(GroceryItem data, GroceryNode next) {
      this.data = data;
      this.next = next;
    }
  }
}

