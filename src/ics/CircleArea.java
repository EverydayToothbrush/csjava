package ics;
import java.lang.Math;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the radius? ");
        double r = scan.nextDouble();
        scan.close();
        System.out.println(Area(r));
    }

    private static double Area(double r){
        return Math.pow(r, 2) * Math.PI;
    }
}
