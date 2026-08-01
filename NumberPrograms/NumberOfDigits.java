// Program to count the total number of digits in a given number.

package numberprograms;

import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digits = 0;

        while (number > 0) {
            digits++;
            number /= 10;
        }

        System.out.println("Total Digits = " + digits);
    }
}
