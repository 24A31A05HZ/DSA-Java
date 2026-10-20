package DataStructures.Queue;


import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("Updated deque: " + deque);
    }
}
