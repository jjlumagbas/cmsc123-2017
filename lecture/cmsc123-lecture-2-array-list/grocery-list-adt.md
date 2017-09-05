# Grocery list abstract data type

## GroceryItem

```Java
String name
int quantity
boolean isBought
```

## IGroceryList

- `boolean add(GroceryItem item)`

Adds an GroceryItem to the end of the list. If a duplicate GroceryItem is added, the quantity of the existing GroceryItem is increased instead.

accepts GroceryItem  
returns true if add is successful



- `boolean remove(String name)`

Removes the GroceryItem with the given name from the list

accepts name of the GroceryItem to remove  
returns true if the remove was successful



- `boolean markAsBought(String name)`

If the specified name is in the list, mark the GroceryItem as bought

accepts name of the GroceryItem to mark  
returns true if the GroceryItem is in the list



- `void display()`

Displays each item in the list

accepts -  
returns - 

