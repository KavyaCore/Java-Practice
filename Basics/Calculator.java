// Program to perform basic arithmetic operations using if-else.

package basics;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("p - Addition");
        System.out.println("s - Subtraction");
        System.out.println("m - Multiplication");
        System.out.println("d - Division");

        char ch = sc.next().charAt(0);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (ch == 'd' && b == 0) {
            System.out.println("Division by zero is not defined.");
        } else {
            if (ch == 'p') {
                System.out.println("Result = " + (a + b));
            } else if (ch == 's') {
                System.out.println("Result = " + (a - b));
            } else if (ch == 'm') {
                System.out.println("Result = " + (a * b));
            } else if (ch == 'd') {
                System.out.println("Result = " + (a / b));
            } else {
                System.out.println("Invalid operation.");
            }
        }
    }
}
