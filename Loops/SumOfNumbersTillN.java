// Program to calculate the sum of numbers from 1 to N using a do-while loop.

package loops;

import java.util.Scanner;

public class SumOfNumbersTillN_DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Sum = " + sum);
    }
}
