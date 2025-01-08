package AD_1.Lab_2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int[] result = new int[n];
        int start = 0, end = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag) {
                result[i] = arr[end--];
            } else {
                result[i] = arr[start++];
            }
            flag = !flag;
        }

        System.out.println("Maximum minimum array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
