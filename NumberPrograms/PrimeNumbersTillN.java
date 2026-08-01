// Program to print all Prime Numbers from 2 to N.

package numberprograms;

import java.util.Scanner;

public class PrimeNumbersTillN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Prime Numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {

            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
