// Program to extract the digits of a four-digit number using the chopping method.

package algorithms;

import java.util.Scanner;

public class DigitChopping {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a four-digit number: ");
        int number = sc.nextInt();

        int ones = number % 10;
        number /= 10;

        int tens = number % 10;
        number /= 10;

        int hundreds = number % 10;
        number /= 10;

        int thousands = number % 10;

        System.out.println("Thousands = " + thousands);
        System.out.println("Hundreds = " + hundreds);
        System.out.println("Tens = " + tens);
        System.out.println("Ones = " + ones);
    }
}
