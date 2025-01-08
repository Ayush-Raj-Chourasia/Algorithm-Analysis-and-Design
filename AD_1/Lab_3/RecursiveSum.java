package AD_1.Lab_3;

import java.util.Scanner;

public class RecursiveSum {
    public static int sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sum of numbers: " + sum(arr, n));
        scanner.close();
    }
}
