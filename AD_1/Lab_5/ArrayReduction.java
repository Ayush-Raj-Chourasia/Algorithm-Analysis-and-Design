package AD_1.Lab_5;

import java.util.Scanner;

public class ArrayReduction {
    public static void reduceArray(int[] arr) {
        int count = 0;
        while (true) {
            int min = findSmallestNonZero(arr);
            if (min == 0) break;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) arr[i] -= min;
            }

            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

            count++;
        }
        System.out.println("Number of Reduction steps = " + count);
    }

    public static int findSmallestNonZero(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) min = arr[i];
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        reduceArray(arr);
        sc.close();
    }
}


// Enter the size of array: 5
// Enter array elements:
// 2
// 4
// 9
// 8
// 15
// 0 2 7 6 13 
// 0 0 5 4 11
// 0 0 1 0 7
// 0 0 0 0 6
// 0 0 0 0 0