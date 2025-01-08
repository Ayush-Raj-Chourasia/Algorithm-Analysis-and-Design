package AD_1.Lab_1;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        k = k % n;

        System.out.println("Array after rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + k) % n] + " ");
        }
        scanner.close();
    }
}
