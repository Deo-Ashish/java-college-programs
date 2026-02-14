package OOPsLab;

import java.util.Scanner;

//5. Program to enter a number from keyboard and find out factorial of the number
public class FactorialFinder {
    public static void main(String[] args) {
        int fact = 1;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        sc.close();
    }
}
