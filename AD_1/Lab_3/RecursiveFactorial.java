package AD_1.Lab_3;

import java.util.Scanner;

public class RecursiveFactorial {
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Factorial of " + n + ": " + factorial(n));
        scanner.close();
    }
}
