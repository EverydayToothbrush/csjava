import java.util.Scanner;

public class importing {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println(String.format("you number is: %1$d, %2$d, %3$d", a, b, c));
    }
}