import java.util.*;

public class AddTwoComplexNum {
    int r, i;

    void getData(Scanner sc) {
        System.out.print("Enter real and imaginary numbers: ");
        r = sc.nextInt();
        i = sc.nextInt();
    }

    void sum(AddTwoComplexNum C2) {
        r = r + C2.r;
        i = i + C2.i;
    }

    void display() {
        System.out.println("Real = " + r);
        System.out.println("Imaginary = " + i);
    }
}

class complex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddTwoComplexNum C1 = new AddTwoComplexNum();
        AddTwoComplexNum C2 = new AddTwoComplexNum();
        C1.getData(sc);
        C2.getData(sc);
        C1.sum(C2);
        C1.display();

        sc.close();
    }
}
