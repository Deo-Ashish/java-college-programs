import java.util.Scanner;

public class AvgMarksCalculator {
    public static void main(String[] args) {
        //Q.2 Enter three subjects of any student & calculate the average marks if the average marks is <= 75 display distinction if the average mark is <= 60 less than 75 display first division if the average marks is <= 45 & > 60 display second division otherwise display fail.
        int a, b, c, avg;

        System.out.print("Enter marks of three subjects: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        avg = (a+b+c)/3;

        if (avg >= 75 && avg <= 100){
            System.out.println("Distinction");
        }
        else if (avg >= 60){
            System.out.println("First Division");
        }
        else if (avg >= 45){
            System.out.println("Second Division");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
