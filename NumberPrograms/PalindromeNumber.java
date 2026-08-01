// Program to check whether a given number is a Palindrome Number.

package numberprograms;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (reverse == original)
            System.out.println(original + " is a Palindrome Number.");
        else
            System.out.println(original + " is not a Palindrome Number.");
    }
}
