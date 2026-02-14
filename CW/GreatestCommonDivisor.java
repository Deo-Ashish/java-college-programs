import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number to find GCD: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        for (int i = 1; i <= (a > b ? a : b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("Greatest common divisor of " + a + " and " + b + " is " + gcd);

        sc.close();
    }
}