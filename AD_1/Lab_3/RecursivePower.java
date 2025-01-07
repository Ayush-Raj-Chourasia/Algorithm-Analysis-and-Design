package AD_1.Lab_3;

import java.util.Scanner;

public class RecursivePower {
    public static long power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scanner.nextInt();

        System.out.println(base + " raised to the power " + exp + ": " + power(base, exp));
    }
}
