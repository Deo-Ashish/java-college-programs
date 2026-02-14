
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.print("Enter any number to find its sum: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}