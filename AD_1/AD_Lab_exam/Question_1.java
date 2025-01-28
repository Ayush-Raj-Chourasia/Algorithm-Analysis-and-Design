package AD_Lab_exam;


// All questions are compulsory Sem: 3 Time: 90 Mins. Q1. During a security guard interview, each candidate's height is measured against a standard height "h." A value that indicates the deviation from the standard height, either Ofthe same) or a ve (more than standard) or ve (less than and all deviation values are considered as integers). standard), is retained for subsequent processing which height is most common? (h Case Study: For 15 candidates with standard height h-6, the list showing deviation in height is {1, 0, 1, 2, 1, 2, 2, 1, 1, -1, 1, 0, -1, -1, 1). The most common height is 7.


public class Question_1 {
    public static void main(String[] args) {
        // Input data
        int h = 6;
        int[] deviations = {1, 0, 1, 2, 1, 2, 2, 1, 1, -1, 1, 0, -1, -1, 1};

        int maxDeviation = findMax(deviations);
        int minDeviation = findMin(deviations);

        int range = maxDeviation - minDeviation + 1;
        int[] frequency = new int[range];

        for (int deviation : deviations) {
            frequency[deviation - minDeviation]++;
        }

        int maxFrequency = 0;
        int mostCommonDeviation = 0;

        for (int i = 0; i < range; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostCommonDeviation = i + minDeviation;
            }
        }

        int mostCommonHeight = h + mostCommonDeviation;

        System.out.println("The most common height is: " + mostCommonHeight);
    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
