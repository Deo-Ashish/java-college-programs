import java.util.Scanner;

//Q.3 Enter the unit electricity consumed & display the bill amount unsing following table.
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        int unit, bill;

        System.out.print("Enter Unit electricity: ");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();

        if (unit >= 1 && unit <= 100) {
            bill = unit * 5;
            System.out.println("Your bill is ₹" + bill);
        } else if (unit > 100 && unit <= 500) {
            bill = (100 * 5 + (unit - 100) * 10) + 150;
            System.out.println("Your bill is ₹" + bill);
        } else if (unit >= 500) {
            bill = (100 * 5 + 400 * 10 + (unit - 500) * 15) + 150;
            System.out.println("Your bill is ₹" + bill);
            sc.close();
        }
    }
}
