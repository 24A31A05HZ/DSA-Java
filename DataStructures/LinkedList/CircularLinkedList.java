package DataStructures.LinkedList;


public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node tail;

    // Insert at end
    void insert(int data) {
        Node node = new Node(data);

        if (tail == null) {
            tail = node;
            tail.next = tail;
            return;
        }

        node.next = tail.next;
        tail.next = node;
        tail = node;
    }

    void delete(int key) {
        if (tail == null) {
            return;
        }

        Node previous = tail;
        Node current = tail.next;

        do {
            if (current.data == key) {
                if (current == previous) {
                    tail = null;
                } else {
                    previous.next = current.next;

                    if (current == tail) {
                        tail = previous;
                    }
                }
                return;
            }

            previous = current;
            current = current.next;

        } while (current != tail.next);
    }

    void display() {
        if (tail == null) {
            System.out.println("Empty list");
            return;
        }

        Node current = tail.next;

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        list.delete(10);
        list.display();
    }
}
