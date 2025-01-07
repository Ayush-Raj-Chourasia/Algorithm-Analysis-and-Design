package AD_1.Lab_7;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxDifference {
    public static void findMinMaxDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            minDiff = Math.min(minDiff, diff);
            maxDiff = Math.max(maxDiff, diff);
        }

        System.out.println("Minimum difference: " + minDiff);
        System.out.println("Maximum difference: " + maxDiff);
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

        findMinMaxDifference(arr);
    }
}
