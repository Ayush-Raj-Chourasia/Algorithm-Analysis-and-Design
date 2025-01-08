package AD_1.Lab_7;

public class MissingNumber {
    public static int findMissing(int arr[], int size) {
        for (int i = 0; i <= size; i++) { // Check numbers from 0 to size
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i; // Return the first missing number
            }
        }
        return -1; // If no number is missing
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 40, 2, 3, 5, 12, 0, 1 };
        System.out.println("The missing number is: " + findMissing(arr, arr.length));
    }
}
