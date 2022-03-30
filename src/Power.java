/*
Ryan Chien
Period 4
Recursion
Power
 */

import java.util.Scanner;

public class Power {
    // calculate base to the power of n
    public static int power(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * power(base, n - 1);
        }
    }

    public static void main(String[] args) {
        // get input for base and n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter exponent: ");
        int n = input.nextInt();
        System.out.println(base + " to the power of " + n + " is " + power(base, n));
    }
}
