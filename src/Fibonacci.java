/*
Ryan Chien
Period 4
Recursion
Fibonacci
 */

import java.util.Scanner;

public class Fibonacci {
    // recursive function to calculate fibonacci sequence
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        // get user input to print first n numbers of fibonacci sequence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
