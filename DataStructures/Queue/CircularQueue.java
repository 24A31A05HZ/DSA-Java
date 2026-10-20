package DataStructures.Queue;


public class CircularQueue {
    private int[] queue;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Circular queue is full");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Circular queue is empty");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Circular queue is empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(
                queue[(front + i) % queue.length] + " "
            );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.enqueue(40);

        System.out.print("After inserting 40: ");
        q.display();
    }
}
