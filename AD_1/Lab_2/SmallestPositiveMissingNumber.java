package AD_1.Lab_2;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 5, 2};
        int missingNumber = findSmallestMissingNumber(arr);
        System.out.println("Smallest positive missing number: " + missingNumber);
    }

    public static int findSmallestMissingNumber(int[] arr) {
        int n = arr.length;

     
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int smallestMissing = 1; 
        for (int num : arr) {
            if (num == smallestMissing) {
                smallestMissing++;
            }
        }
        return smallestMissing;
    }
}
