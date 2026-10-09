package DataStructures.LinkedList;


public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Insert at beginning
    void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    // Insert at end
    void insertLast(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
    }

    // Delete first occurrence of a value
    void delete(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null &&
               current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Search for a value
    boolean search(int key) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // Display list
    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(30);
        list.insertLast(40);

        System.out.print("List: ");
        list.display();

        System.out.println("Search 30: " + list.search(30));

        list.delete(20);

        System.out.print("After deletion: ");
        list.display();
    }
}
