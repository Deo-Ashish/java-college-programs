package OOPsLab;

import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print prime numbers:");
        int n = sc.nextInt();
        int count = 0;
        for (int x = 1; x <= n; x++) {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.print(x + " ");
            }
            count = 0;
        }
        sc.close();
    }
}
