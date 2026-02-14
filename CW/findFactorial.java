// find factorial of a Number

import java.util.*;

public class findFactorial {
    public static void main(String[] args) {
        int i = 1, fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");

        int num = sc.nextInt();

        while (i <= num) {
            fact = fact * i;
            i++;
        }

        System.out.print("Factorial of " + num + " is " + fact);
        sc.close();
    }
}

