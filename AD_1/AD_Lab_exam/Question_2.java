package AD_Lab_exam;



// Q2. You are given a list of 'n' students with their names and total marks secured in the examination. Write a program to arrange them in non-increasing order of their marks and decide if a unique or joint topper exists. Display the name of the topper/toppers. Test case 1: Input Name and Marks of 6 students Vineet Shreya Vishal Kamath Rabin Sandy 275 312 195 275 235 205 Test case 2: Input Name and Marks of 6 students Vineet Shreya Vishal Kamath Rabin Sandy 195 287 275 312 312 205 Shreya 312 Test case 1: Output Unique topper: Shreya Kamath Vineet Rabin Sandy Vishal 275 275 235 205 195 Test case 2: Output Joint toppers: Shreya and Rabin Shreya 312 Rabin 312 275 Kamath Vineet Sandy Vishal 287 205 195

import java.util.*;

public class Question_2 {
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

        Arrays.sort(students, (a, b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));

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
