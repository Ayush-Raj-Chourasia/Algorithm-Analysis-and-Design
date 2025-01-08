package AD_1.Lab_3;

import java.util.Scanner;

public class RecursiveGCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("GCD of " + a + " and " + b + ": " + gcd(a, b));
        scanner.close();
    }
}

