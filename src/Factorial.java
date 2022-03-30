/*
Ryan Chien
Period 4
Recursion
Factorial
 */

import java.util.Scanner;

public class Factorial {
    // calculate factorial using recursion
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // get user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        // print result of factorial
        System.out.println("The factorial of " + n + " is " + factorial(n));
    }
}
