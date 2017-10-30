import java.util.ArrayList;

public class Stack<E> {
    ArrayList<E> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int size() {
        return items.size();
    }

    public void push(E item) {
        int top = items.size();
        items.add(top, item);
    }

    public E pop() {
        if (items.isEmpty()) {
            System.out.println("The stack is empty");
            return null;
        }
        int top = items.size() - 1;
        E item = items.remove(top);
        return item;
    }

    public E peek() {
        if (items.isEmpty()) {
            System.out.println("The stack is empty");
            return null;
        }
        int top = items.size() - 1;
        E item = items.get(top);
        return item;
    }

    public String toString() {
        return items.toString();
    }
}
