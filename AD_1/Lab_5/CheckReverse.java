package AD_1.Lab_5;

import java.util.Scanner;

public class CheckReverse {
    public static boolean canReverseToSort(int[] arr) {
        int start = -1, end = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                if (start == -1) {
                    start = i;
                }
                end = i + 1;
            }
        }

        if (start == -1) {
            return true; // Already sorted
        }

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
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

        if (canReverseToSort(arr)) {
            System.out.println("Array can be sorted by reversing a single subarray.");
        } else {
            System.out.println("Array cannot be sorted by reversing a single subarray.");
        }
        scanner.close();
    }
}
