package AD_1.Lab_3;

import java.util.Scanner;

public class RecursiveSmallestPositiveMissingNumber {
    public static int findMissing(int[] arr, int n, int num) {
        if (n == 0) return num;

        if (arr[n - 1] == num) {
            return findMissing(arr, arr.length, num + 1);
        }
        return findMissing(arr, n - 1, num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Smallest positive missing number: " + findMissing(arr, n, 1));
        scanner.close();
    }
}
