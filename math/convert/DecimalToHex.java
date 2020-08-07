/**
 * Decimal to Hexadecimal
 * it convert decimal number to hexa
 * present in sub-package convert of math package
 */
package math.convert;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        // decimalToHex();
    }

    public void decimalToHex() {

        System.out.println("\n\t\tDecimal to Hexadecimal!\n");

        int decimal, rem, m;
        String hex = "";
        char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        System.out.print("\tEnter the Decimal number: ");

        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
        sc.close();

        m = decimal;

        while (decimal > 0) {
            rem = decimal % 16;
            hex = hexchars[rem] + hex;
            decimal = decimal / 16;
        }

        System.out.println("\tDecimal to Hexadecimal of " + m + " is: " + hex);
    }

}