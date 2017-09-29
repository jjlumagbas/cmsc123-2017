interface IBox<E> {
  boolean put(E item);
  
  E take() throws Exception ;
  
  boolean isEmpty();
}