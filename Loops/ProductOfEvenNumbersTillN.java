// Program to calculate the product of all even numbers from 1 to N.

package loops;

import java.util.Scanner;

public class ProductOfEvenNumbersTillN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int product = 1;
        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                product *= i;
            }
            i++;
        }

        System.out.println("Product of Even Numbers = " + product);
    }
}
