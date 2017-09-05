class GroceryListArray implements IGroceryList {
  
  int max = 10;
  GroceryItem items[] = new GroceryItem[max];
  int size = 0;
  
  GroceryListArray() {}
    
  
  public boolean add(GroceryItem item) {
    if (size == max) {
      // create new array with bigger length
      // int max = max + 10;
      // GroceryItems bigger[] = new GroceryItem[max]
      // copy items to new array
      // assign new array to items
      
      return false; // don't return instead
    }
    
    int i = indexOf(item);
    if (i > -1) {
      items[i].addQuantity(item.quantity);
    } else {    
      items[this.size] = item;
      this.size++;
      
    }
    return true;
  }
  
  int indexOf(GroceryItem item) {
    for (int i = 0; i < this.size; i++) {
      if (item.equals(items[i])) {
        return i;
      }
    }
    
    return -1;
  }
  
  public boolean remove(String name) {
    return false;
  }
  
  public boolean markAsBought(String name) {
    return false;
  }
  
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(items[i]);
    }
  }
}