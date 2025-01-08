package AD_Lab_exam;


// Q3. Two linked lists, 'A' and 'B', were given. A is expected to be a list of even numbers, and B is expected to be a list of odd numbers. But in the input, 'A' has one odd element, and 'B' has an even element. Write a program to create linked lists and a method to operate on these two lists to update them as expected. Test case: Input: ( A / 150 -> 52 -> 26 -> 31 -> 12 -> 64 \ and {B: 23 -> 100 -> 7 -> 17 -> 3 \ . Output: ( A / 150 -> 52 -> 26 -> 100 -> 12 -> 64 \ and {B: 23 -> 31 -> 7 -> 17 -> 3 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

  
    void correctLists(LinkedList other) {
        Node currentA = this.head;
        Node previousA = null;
        Node oddInA = null;
        Node evenInB = null;

        while (currentA != null) {
            if (currentA.data % 2 != 0) {
                oddInA = currentA;
                break;
            }
            previousA = currentA;
            currentA = currentA.next;
        }

        Node currentB = other.head;
        Node previousB = null;
        while (currentB != null) {
            if (currentB.data % 2 == 0) {
                evenInB = currentB;
                break;
            }
            previousB = currentB;
            currentB = currentB.next;
        }

        if (oddInA != null && evenInB != null) {
            if (previousA != null) {
                previousA.next = evenInB;
            } else {
                this.head = evenInB;
            }

            if (previousB != null) {
                previousB.next = oddInA;
            } else {
                other.head = oddInA;
            }

            Node temp = oddInA.next;
            oddInA.next = evenInB.next;
            evenInB.next = temp;
        }
    }
}

public class Question_3 {
    public static void main(String[] args) {
        LinkedList listA = new LinkedList();
        listA.add(150);
        listA.add(52);
        listA.add(26);
        listA.add(31);
        listA.add(12);
        listA.add(64);

        LinkedList listB = new LinkedList();
        listB.add(23);
        listB.add(100);
        listB.add(7);
        listB.add(17);
        listB.add(3);

        System.out.println("Original List A:");
        listA.printList();

        System.out.println("Original List B:");
        listB.printList();

        
        listA.correctLists(listB);

        System.out.println("\nUpdated List A:");
        listA.printList();

        System.out.println("Updated List B:");
        listB.printList();
    }
}
