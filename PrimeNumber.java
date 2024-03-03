import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean prime = true;
        for (int i = n1; i < n2; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }

        }
    }
}
