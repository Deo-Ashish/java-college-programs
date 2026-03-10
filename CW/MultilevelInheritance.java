import java.util.Scanner;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result obj = new Result();
        obj.getData1(sc);
        obj.getData2(sc);
        obj.calculate();
        obj.display();

        sc.close();
    }
}

class Student {
    int roll;

    void getData1(Scanner sc) {
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
    }
}

class Subject extends Student {
    int sub1, sub2;

    void getData2(Scanner sc) {
        System.out.print("Enter marks of subject 1 and subject 2: ");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
    }
}

class Result extends Subject {
    int total;

    void calculate() {
        total = sub1 + sub2;
    }

    void display() {
        System.out.println("Result: " + total);
    }

}
