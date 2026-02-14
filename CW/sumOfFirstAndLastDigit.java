
import java.util.Scanner;

public class sumOfFirstAndLastDigit {
    static void main(String[] args) {
        int n, rev = 0, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int last = n % 10;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        int first = rev % 10;
        sum = first + last;
        System.out.println("sum = " + sum);
        sc.close();
    }
}
