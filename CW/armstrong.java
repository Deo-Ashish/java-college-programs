import java.util.Scanner;

public class armstrong {
    static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        int temp = n;
        int digits = 0;

        //digits length
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        double sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == n){
            System.out.println("This number is Armstrong number.");
        }
        else {
            System.out.println("not Armstrong");
        }
        sc.close();
    }
}
