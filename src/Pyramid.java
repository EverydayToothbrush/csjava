import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        // Upgrade the Pyramid
        Scanner scan = new Scanner(System.in);
        System.out.print("How large do you want the base of the pyramid? ");
        int a = scan.nextInt();
        for(int i = 1; i <= a; i++){
            System.out.println("*".repeat(i));
        }

        /*
        for(int i = 0; i < 6; i++){
            System.out.println("*".repeat(i));
        }*/
    }
}
