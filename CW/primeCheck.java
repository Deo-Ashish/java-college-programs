import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime number or not:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
}
