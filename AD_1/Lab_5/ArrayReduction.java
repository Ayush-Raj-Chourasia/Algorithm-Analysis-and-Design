package AD_1.Lab_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReduction {
    public static int reduceArray(int[] arr) {
        Arrays.sort(arr);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * (arr.length - i);
        }

        return sum;
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

        System.out.println("Total cost of reduction: " + reduceArray(arr));
    }
}
