package AD_1.Lab_10;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        public Stack() {
            top = null;
        }

        // Push an element to the stack
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            System.out.println(data + " pushed to stack");
        }

        // Pop an element from the stack
        public int pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int popped = top.data;
            top = top.next;
            return popped;
        }

        // Peek the top element of the stack
        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == null;
        }

        // Print the stack
        public void printStack() {
            Node temp = top;
            if (temp == null) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Stack: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Performing stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack(); // Output: Stack: 40 30 20 10

        System.out.println("Top element is " + stack.peek()); // Output: Top element is 40

        System.out.println(stack.pop() + " popped from stack"); // Output: 40 popped from stack

        stack.printStack(); // Output: Stack: 30 20 10

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? false
    }
}
