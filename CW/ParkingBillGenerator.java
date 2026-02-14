import java.util.Scanner;

//Q.Write a program to generate bill for a parking system where people park car, bike, and cycle it's cost is 50, 20, 10 respectively.
public class ParkingBillGenerator {
    public static void main(String[] args) {
        int car = 0, bike = 0, cycle = 0, bill;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("---Parking Menu---");
            System.out.println("1.CAR");
            System.out.println("2.BIKE");
            System.out.println("3.CYCLE");
            System.out.println("4.BILL");
            System.out.println("5.EXIT");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ++car;
                    break;

                case 2:
                    ++bike;
                    break;

                case 3:
                    ++cycle;
                    break;

                case 4:
                    bill = (car * 50) + (bike * 20) + (cycle * 10);
                    System.out.println("Your bill is " + bill);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input!");
            }
            sc.close();
        }
    }
}
