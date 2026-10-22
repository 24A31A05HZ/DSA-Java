package DataStructures.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    private final Deque<Integer> stack = new ArrayDeque<>();
    private final Deque<Integer> minStack = new ArrayDeque<>();

    // Insert an element
    void push(int value) {
        stack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Remove the top element
    int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int value = stack.pop();

        if (value == minStack.peek()) {
            minStack.pop();
        }

        return value;
    }

    // Get the top element
    int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return stack.peek();
    }

    // Get the minimum element
    int getMin() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();

        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println("Minimum: " + s.getMin());

        s.pop();

        System.out.println("Top: " + s.top());
        System.out.println("Minimum after pop: " + s.getMin());
    }
}

