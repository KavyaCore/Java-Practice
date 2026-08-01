// Program to display the number of days in a given month.

package basics;

import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January - 31 days");
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    System.out.println("February - 29 days");
                else
                    System.out.println("February - 28 days");
                break;

            case 3:
                System.out.println("March - 31 days");
                break;

            case 4:
                System.out.println("April - 30 days");
                break;

            case 5:
                System.out.println("May - 31 days");
                break;

            case 6:
                System.out.println("June - 30 days");
                break;

            default:
                System.out.println("Invalid month number.");
        }
    }
}
