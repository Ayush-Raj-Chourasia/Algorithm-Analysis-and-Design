package AD_1.Lab_8;

public class LinkedListOperations {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Insert at the start
        public void insertAtStart(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Insert at the end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        // Insert at a specific position
        public void insertAtPosition(int data, int position) {
            Node newNode = new Node(data);
            if (position == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // Delete at the start
        public void deleteAtStart() {
            if (head != null) {
                head = head.next;
            }
        }

        // Delete at the end
        public void deleteAtEnd() {
            if (head == null) return;
            if (head.next == null) {
                head = null;
                return;
            }
            Node temp = head;
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        // Delete at a specific position
        public void deleteAtPosition(int position) {
            if (head == null) return;
            if (position == 1) {
                head = head.next;
                return;
            }
            Node temp = head;
            for (int i = 1; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) return;
            temp.next = temp.next.next;
        }

        // Print the list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Reverse the list
        public void reverse() {
            Node prev = null, current = head, next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Performing various operations
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtStart(0);
        list.insertAtPosition(5, 3);

        System.out.print("Linked List after insertions: ");
        list.printList(); // Output: 0 1 5 2 3

        list.deleteAtStart();
        list.deleteAtEnd();
        list.deleteAtPosition(2);

        System.out.print("Linked List after deletions: ");
        list.printList(); // Output: 2

        list.reverse();
        System.out.print("Linked List after reversal: ");
        list.printList(); // Output: 2
    }
}
