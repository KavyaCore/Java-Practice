// Program to count the frequency of a digit in a given number.

package numberprograms;

import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter the digit to find its frequency: ");
        int digitToFind = sc.nextInt();

        int count = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit == digitToFind) {
                count++;
            }

            number /= 10;
        }

        System.out.println("Frequency of " + digitToFind + " = " + count);
    }
}
