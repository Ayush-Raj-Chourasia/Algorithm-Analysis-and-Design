package AD_1.Lab_9;

import java.util.*;

public class JavaCollectionsExample {
    public static void main(String[] args) {
        // List example (ArrayList)
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("ArrayList: " + list);

        // Set example (HashSet)
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(7); // Duplicate element, will not be added
        System.out.println("HashSet: " + set);

        // Map example (HashMap)
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("HashMap: " + map);

        // Queue example (LinkedList as Queue)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);
        queue.poll(); // Removes the first element
        System.out.println("Queue after poll: " + queue);

        // Stack example (Stack)
        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Stack: " + stack);
        stack.pop(); // Removes the top element
        System.out.println("Stack after pop: " + stack);
    }
}
