// Program to print the Fibonacci series up to N terms.

package loops;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int next;

        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 0; i <= (n - 2); i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
    }
}
