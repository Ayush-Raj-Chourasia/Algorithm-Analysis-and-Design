package AD_1.Lab_7;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedElement {
    public static int findFirstRepeated(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1; // No repeated elements
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number of elements: ");
        // int n = scanner.nextInt();
        int[] arr = {34,56,77,1,5,6,6,6,7,8,10,34,20,30};

        // System.out.println("Enter the elements:");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = scanner.nextInt();
        // }

        int result = findFirstRepeated(arr);
        if (result != -1) {
            System.out.println("First repeated element: " + result);
        } else {
            System.out.println("No repeated elements found.");
        }
        scanner.close();
    }
}
