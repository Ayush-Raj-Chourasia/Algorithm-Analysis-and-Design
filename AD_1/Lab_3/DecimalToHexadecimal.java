package AD_1.Lab_3;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static String decimalToHex(int num) {
        if (num == 0) {
            return "";
        }
        int remainder = num % 16;
        char hexDigit = (char) (remainder < 10 ? '0' + remainder : 'A' + remainder - 10);
        return decimalToHex(num / 16) + hexDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        String hex = decimalToHex(num);
        System.out.println("Hexadecimal: " + (hex.isEmpty() ? "0" : hex));
        scanner.close();
    }
}
