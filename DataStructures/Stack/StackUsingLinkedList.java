package DataStructures.Stack;


public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    // Insert at the top
    void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    // Remove the top element
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    // View the top element
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        Node current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek());
        System.out.println("Removed: " + s.pop());

        System.out.println("Stack elements:");
        s.display();
    }
}

