package AD_1.Lab_7;

import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        System.out.println("Enter the elements (1 to " + n + " excluding the missing one):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int missing = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missing);
    }
}
