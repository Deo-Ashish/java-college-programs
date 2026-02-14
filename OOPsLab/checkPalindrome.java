package OOPsLab;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        int num, rev = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check:");
        num = sc.nextInt();
        int original = num;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (rev == original) {
            System.out.println(original + " is palindrome number.");
        } else {
            System.out.println(original + " is not palindrome:");
        }
        sc.close();
    }
}


