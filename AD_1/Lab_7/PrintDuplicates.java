package AD_1.Lab_7;

import java.util.HashSet;
import java.util.Scanner;

public class PrintDuplicates {
    public static void printDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        boolean foundDuplicate = false;
        
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate found: " + num);
                foundDuplicate = true;
            }
        }
        
        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        printDuplicates(arr);
        scanner.close();
    }
}
