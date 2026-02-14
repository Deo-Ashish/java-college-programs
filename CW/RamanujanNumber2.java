import java.util.Scanner;

public class RamanujanNumber2 {
    static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0){
            sum = sum + n % 10;
            n = n/10;
        }
        sc.close();
    }
}
