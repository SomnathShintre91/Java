/**
 * Hexa to Decimal
 * it convert hex number to decimal
 * present in sub-package convert of math package
 */
package math.convert;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {
        // hexToDecimal();
    }

    public void hexToDecimal() {

        System.out.println("\n\t\tHexadecimal to Decimal!\n");

        String hex, m, digits = "0123456789ABCDEF";
        int val = 0;

        System.out.print("\tEnter the Hexadecimal number: ");
        Scanner sc = new Scanner(System.in);
        hex = sc.next();
        sc.close();

        m = hex;

        hex = hex.toUpperCase();

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        System.out.println("\tHexadecimal to Decimal of " + m + " is: " + val);
    }

}