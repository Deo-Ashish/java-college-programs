import java.util.Scanner;

public class SingleLevelInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        B obj = new B();
        obj.getData1(sc);
        obj.getData2(sc);
        obj.calculate();
        obj.display();

        sc.close();
    }
}

class A {
    int x, y;

    void getData1(Scanner sc) {
        System.out.print("Enter value of x and y: ");
        x = sc.nextInt();
        y = sc.nextInt();
    }
}

class B extends A {
    int m, z;

    void getData2(Scanner sc) {
        System.out.print("Enter value of m: ");

        m = sc.nextInt();
    }

    void calculate() {
        z = x * y + m;
    }

    void display() {
        System.out.println("Result: " + z);
    }

}
