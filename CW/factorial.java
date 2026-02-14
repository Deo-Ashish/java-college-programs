import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        int n, fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int i = 1;

        while(i <= n){
            fact = fact * i;
            i++;
        }

        System.out.println("factorial = " + fact);
        sc.close();
    }
}
