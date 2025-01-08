package AD_1.Lab_5;

public class MergingArrays {
    /*
      Input: 
      arr1 = {1, 5, 9, 10, 15, 20}
      arr2 = {2, 3, 8, 13}
      
      Output: 
      arr1 = {1, 2, 3, 5, 8, 9}
      arr2 = {10, 13, 15, 20}
      Merged Array: {1, 2, 3, 5, 8, 9, 10, 13, 15, 20}
    */

    public static void mergeSortedArrays(int[] arr1, int size1, int[] arr2, int size2) {
        int index = 0;

        while (index < size1) {
            if (arr1[index] <= arr2[0]) {
                index++;
            } else {
                // Swap the element from arr1 with the smallest element of arr2
                int temp = arr1[index];
                arr1[index] = arr2[0];
                arr2[0] = temp;
                index++;

                // Reorganize arr2 to maintain its sorted order
                for (int i = 0; i < size2 - 1; i++) {
                    if (arr2[i] < arr2[i + 1]) {
                        break;
                    }
                    int temp2 = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = temp2;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};

        System.out.println("Initial Arrays:");
        System.out.print("arr1: ");
        for (int num : arr1)
            System.out.print(num + " ");
        System.out.println();

        System.out.print("arr2: ");
        for (int num : arr2)
            System.out.print(num + " ");
        System.out.println();

        mergeSortedArrays(arr1, arr1.length, arr2, arr2.length);

        System.out.println("\nFinal Arrays:");
        System.out.print("arr1: ");
        for (int num : arr1)
            System.out.print(num + " ");
        System.out.println();

        System.out.print("arr2: ");
        for (int num : arr2)
            System.out.print(num + " ");
        System.out.println();

        // Combine arr1 and arr2 into a merged array
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        System.out.println("\nMerged Array:");
        for (int num : mergedArray)
            System.out.print(num + " ");
    }
}
