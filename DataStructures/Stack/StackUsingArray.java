package DataStructures.Stack;


public class StackUsingArray {

    private final int[] stack;
    private int top;

    StackUsingArray(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    // Insert an element
    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    // Remove the top element
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    // View the top element
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek());
        System.out.println("Removed: " + s.pop());

        System.out.println("Stack elements:");
        s.display();
    }
}

