import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(isPrime(a));

    }

    private static boolean isPrime(int a){
        if(a == 1 || a == 0){
            return false;
        } else {
            for(int i = 2; i < a; i++) {
                if(a % i != 0) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}



