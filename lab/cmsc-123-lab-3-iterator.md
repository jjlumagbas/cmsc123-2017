# CSMC123 Lab 2: Iterator

1. Create an `Iterator` Iterface that has the following methods:
    * `hasNext` returns a `boolean`
    * `next` return the next item of type E
2. Create a `Collection` Iterface that has the following methods:
    * `iterator` return an `Iterator`
3. Create a `LinkedList` class that implements the `Collection` interface and it should have the following methods:
    * `add` accepts an item of type E and an index of type int and should add the item at the given index
    * `remove` accepts an index of type int and it should remove the item at the given index
    * `size` should return the size of the list
    * `iterator` should return an instance of the `LinkedListIterator`
4. Create a `LinkedListIterator` class that implements the `Iterator` interface.
