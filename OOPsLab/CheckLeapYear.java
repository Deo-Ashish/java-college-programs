package OOPsLab;

import java.util.Scanner;

//3. Program to find whether a year is leap year or not
public class CheckLeapYear {
    public static void main(String[] args) {
        int year;

        System.out.print("Enter your year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if ((year % 400) == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}
