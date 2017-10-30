public class Tester {

    public static void main(String[] args) {
        Stack myStack = new Stack<Integer>();

        myStack.push(1);
        System.out.println("push(1) -> " + myStack.toString());
        myStack.push(10);
        System.out.println("push(10) -> " + myStack.toString());
        myStack.pop();
        System.out.println("pop() -> " + myStack.toString());
        myStack.push(10);
        myStack.push(11);
        myStack.push(12);
        System.out.println(myStack.toString());
        System.out.println("peek() -> " + myStack.peek());
        System.out.println("size() -> " + myStack.size());
        System.out.println("isEmpty() -> " + myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("isEmpty() -> " + myStack.isEmpty());


    }
}
