package AD_1.Lab_11;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        public Queue() {
            front = rear = null;
        }

        // Enqueue (add element to the queue)
        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
            System.out.println(data + " enqueued to queue");
        }

        // Dequeue (remove element from the queue)
        public int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int dequeued = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return dequeued;
        }

        // Peek the front element of the queue
        public int peek() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            return front.data;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return front == null;
        }

        // Print the queue
        public void printQueue() {
            Node temp = front;
            if (temp == null) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        // Performing queue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.printQueue(); // Output: Queue: 10 20 30 40

        System.out.println("Front element is " + queue.peek()); // Output: Front element is 10

        System.out.println(queue.dequeue() + " dequeued from queue"); // Output: 10 dequeued from queue

        queue.printQueue(); // Output: Queue: 20 30 40

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: Is queue empty? false
    }
}
