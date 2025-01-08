package AD_Lab_exam;

import java.util.*;

public class Question_2_1 {
    public static void main(String[] args) {
        String[] names1 = {"Vineet", "Shreya", "Vishal", "Kamath", "Rabin", "Sandy"};
        int[] marks1 = {275, 312, 195, 275, 235, 205};
        System.out.println("Test Case 1:");
        processStudents(names1, marks1);

        String[] names2 = {"Vineet", "Shreya", "Vishal", "Kamath", "Rabin", "Sandy"};
        int[] marks2 = {195, 287, 275, 312, 312, 205};
        System.out.println("\nTest Case 2:");
        processStudents(names2, marks2);
    }

    public static void processStudents(String[] names, int[] marks) {
        int n = names.length;

        String[][] students = new String[n][2];
        for (int i = 0; i < n; i++) {
            students[i][0] = names[i];
            students[i][1] = String.valueOf(marks[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Integer.parseInt(students[j][1]) < Integer.parseInt(students[j + 1][1])) {
                    String[] temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        int highestMarks = Integer.parseInt(students[0][1]);
        List<String> toppers = new ArrayList<>();

        for (String[] student : students) {
            if (Integer.parseInt(student[1]) == highestMarks) {
                toppers.add(student[0]);
            } else {
                break;
            }
        }

        if (toppers.size() == 1) {
            System.out.println("Unique topper: " + toppers.get(0));
        } else {
            System.out.println("Joint toppers: " + String.join(" and ", toppers));
        }

        for (String[] student : students) {
            System.out.println(student[0] + " " + student[1]);
        }
    }
}
