/*
Ryan Chien
Period 4
Recursion
Triangle
 */

import java.util.Scanner;

public class Triangle {
    // calculate blocks needed for n rows
    public static int blocks(int n) {
        if (n == 1) {
            return 1;
        }
        return blocks(n - 1) + n;
    }

    public static void main(String[] args) {
        // get input for number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Blocks needed: " + blocks(n));
    }
}
