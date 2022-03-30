/*
Ryan Chien
Period 4
Recursion
SumDigits
 */

import java.util.Scanner;

public class SumDigits {
    // calculate sum of digits of n
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        // get user input for n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits: " + sumDigits(n));
    }
}
