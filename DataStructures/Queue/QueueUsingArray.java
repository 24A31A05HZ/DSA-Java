package DataStructures.Queue;


public class QueueUsingArray {
    private int[] queue;
    private int front, rear, size;

    public QueueUsingArray(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Front: " + q.peek());
        System.out.println("Removed: " + q.dequeue());

        System.out.print("Queue after dequeue: ");
        q.display();
    }
}
