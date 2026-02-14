import java.util.Scanner;

class Greatest {
    public static void main(String[] args) {

        //Q.1 Enter three different number and display greatest among them.
        /*int a, b, c;

        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println(a);
        } else if (b>a) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }*/

        //For two numbers
        int a, b;
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        sc.close();
    }

}
