package AD_1.Lab_7;

public class MaxFrequencyElement  {
    public static int getMax(int arr[], int size) {
        int max = arr[0];
        int maxCount = 1;

        for (int i = 0; i < size; i++) {
            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                max = arr[i];
                maxCount = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 6, 4, 2, 9, 2, 9, 5, 9, 1};
        int max = getMax(arr, arr.length);
        System.out.println("The element that appears maximum number of times: " + max);
    }
}
