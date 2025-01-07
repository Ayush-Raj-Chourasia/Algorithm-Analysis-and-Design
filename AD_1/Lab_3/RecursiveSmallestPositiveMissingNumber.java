package AD_1.Lab_3;

import java.util.Scanner;
import java.util.HashSet;

public class RecursiveSmallestPositiveMissingNumber {
    public static int findMissing(HashSet<Integer> set, int num) {
        if (!set.contains(num)) {
            return num;
        }
        return findMissing(set, num + 1);
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

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        System.out.println("Smallest positive missing number: " + findMissing(set, 1));
    }
}
