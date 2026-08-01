// Program to check whether a given number is a Harshad (Niven) Number.

package numberprograms;

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        if (sum == 0) {
            System.out.println("Not possible");
        } else {
            if (number % sum == 0)
                System.out.println(number + " is a Harshad Number.");
            else
                System.out.println(number + " is not a Harshad Number.");
        }
    }
}
