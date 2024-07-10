import java.util.Stack;

public class StackImpl {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackImpl(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full.Cannot push" + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.Cannot pop");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.Cannot pop");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Peek: " + stack.peek());
        System.out.println("Is stack empty: " + stack.isEmpty());
        System.out.println("Is stack full: " + stack.isFull());
    }
}
