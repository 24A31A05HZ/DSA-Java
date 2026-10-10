package DataStructures.LinkedList;


public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head, tail;

    void insertLast(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void insertFirst(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    void delete(int key) {
        Node current = head;

        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
    }

    void displayForward() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }

        System.out.println("null");
    }

    void displayBackward() {
        Node current = tail;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(30);
        list.insertLast(40);

        list.displayForward();
        list.displayBackward();

        list.delete(30);

        System.out.print("After deletion: ");
        list.displayForward();
    }
}
