package AD_1.Lab_5;

import java.util.Scanner;

public class MergeSortedArrays {
    public static void mergeArrays(int[] arr1, int[] arr2, int[] merged) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first sorted array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second sorted array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] merged = new int[n1 + n2];
        mergeArrays(arr1, arr2, merged);

        System.out.println("Merged array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
