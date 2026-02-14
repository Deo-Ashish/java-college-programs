
import java.util.Scanner;

public class sumTillSingleDigit {
    static void main(String[] args) {
        int n, rev = 0, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();

        while (n != 0) {
            sum = sum + n % 10;
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        int first = rev % 10;
        sum = sum - first;
        System.out.println("Sum till single digit: " + sum);
        sc.close();
    }
}
