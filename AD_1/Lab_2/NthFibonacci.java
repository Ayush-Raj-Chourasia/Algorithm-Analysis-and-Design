package AD_1.Lab_2;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Fibonacci number: 0");
            return;
        }
        if (n == 1) {
            System.out.println("Fibonacci number: 1");
            return;
        }

        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        System.out.println("Fibonacci number: " + fib);
    }
}
