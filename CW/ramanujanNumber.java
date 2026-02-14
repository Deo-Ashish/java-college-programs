
import java.util.Scanner;

public class ramanujanNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check Ramanujan's number");
        int n = sc.nextInt();

        int count = 0;
        for(int i=1; i*i*i<n; i++){
            for (int j=i+1; j*j*j<n; j++){
                if (i*i*i + j*j*j == n){
                    count++;
                }
            }
        }
        if (count >= 2){
            System.out.println("This is a Ramanujan's number.");
        }
        else {
            System.out.println("This is not a Ramanujan's number.");
        }
        sc.close();
    }
}
