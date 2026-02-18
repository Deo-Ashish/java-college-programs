import java.util.Scanner;

public class AddTwoTime {
    int hr, min;

    // Method to take input
    void getData(Scanner sc) {
        System.out.print("Enter hour and minute numbers: ");
        hr = sc.nextInt();
        min = sc.nextInt();
    }

    // Method to add two times
    void sum(AddTwoTime t2) {
        hr = hr + t2.hr;
        min = min + t2.min;

        // Fix minutes overflow
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }

        // Fix 12-hour format
        if (hr > 12) {
            hr = hr % 12;
            if (hr == 0) {
                hr = 12;
            }
        }
    }

    // Method to display result
    void display() {
        System.out.println("Hour = " + hr);
        System.out.println("Minute = " + min);
    }
}

class Time1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create once

        AddTwoTime t1 = new AddTwoTime();
        AddTwoTime t2 = new AddTwoTime();

        t1.getData(sc);
        t2.getData(sc);

        t1.sum(t2);
        t1.display();

        sc.close(); // Close here (important)
    }
}
