package DataStructures.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(40);
        pq.offer(20);

        System.out.println("Smallest element: " + pq.peek());

        System.out.print("Elements in priority order: ");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        System.out.println();
    }
}
