// Program to check whether a given number is an Armstrong number.

package numberprograms;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digits = 0;
        int armstrong = 0;
        int temp = n;
        int original = n;

        for (; n > 0; n /= 10) {
            digits++;
        }

        for (; temp > 0; temp /= 10) {
            int digit = temp % 10;
            armstrong += (int) Math.pow(digit, digits);
        }

        if (armstrong == original)
            System.out.println(original + " is an Armstrong Number.");
        else
            System.out.println(original + " is not an Armstrong Number.");
    }
}
