package OOPsLab;

import java.util.Scanner;

//2. Program to enter principal, rate & time and find simple interest
public class SIFinder {
    static void main(String[] args) {
        float p, r, t, si;

        System.out.print("Enter principle, rate & year: ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextFloat();
        r = sc.nextFloat();
        t = sc.nextFloat();

        si = (p*r*t)/100;

        System.out.println("Simple Interest is " + si);
        sc.close();
    }
}
