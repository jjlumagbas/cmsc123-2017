# CMSC123 Lab 4: Hash Table

Implement a hash table.

* The hash table should accept strings as key and ints as value
* Handle collision through close addressing strategy
* The hash table should have the following methods:
    * `put(String key, int value)` to add data into the data structure
    * `get(String key)` returns the value with the given key. Return null if the key does not exist.
    * `remove(String key)` removes the value associated with the key and returns it. Return null if the key does not exist.
    * `containsKey(String key)` return True if the key exists in the data structure, False otherwise.
    * `values()` returns a list of all values in the data structure
    * `keys()` returns a list of all keys in the data structure
* You are free to define the hash function.