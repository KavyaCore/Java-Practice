// Program to determine the type of a triangle based on its sides.

package basics;

import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side: ");
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a == b || a == c || b == c)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}
