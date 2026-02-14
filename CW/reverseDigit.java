import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        int n, rev = 0;

        System.out.print("Enter a number to reverse it: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n!=0){
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        System.out.println("Reverse is: " + rev);
        sc.close();
    }
}
