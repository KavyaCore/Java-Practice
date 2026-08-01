// Program to convert an integer to its binary representation.

package basics;

import java.util.Scanner;

public class IntegerToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        StringBuilder binary = new StringBuilder();

        for (; n > 0; n /= 2) {
            binary.append(n % 2);
        }

        System.out.println("Binary = " + binary.reverse());
    }
}
