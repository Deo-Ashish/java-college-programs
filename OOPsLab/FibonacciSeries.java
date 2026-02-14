package OOPsLab;

import java.util.Scanner;

//4. Program to enter a number from keyboard and find out Fibonacci series
public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0, second = 1, next;

        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
