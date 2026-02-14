package OOPsLab;

import java.util.*;

//1. Program to find square root of given number
public class SqrtFinder {
    static void main(String[] args) {
     double num;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();

        double sqrt = Math.sqrt(num);
        System.out.println("Square root = "+sqrt);
        sc.close();
    }
}
