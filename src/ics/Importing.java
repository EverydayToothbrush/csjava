package ics;
import java.util.Scanner;

public class Importing {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println(String.format("your number is: %1$d, %2$d, %3$d", a, b, c));
    }
}
