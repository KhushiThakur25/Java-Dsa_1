import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        // int num = 65;
        // if (num % 2 == 0) {
        //     System.out.println("Number is even..");
        // } else {
        //     System.out.println("Number is odd..");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers a,b,c,d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ((a > b) && (a > c) && (a > d)) {
            System.out.println("a is greatest..");
        } else if ((b > a) && (b > c) && (b > d)) {
            System.out.println("b is greatest..");
        } else if ((c > a) && (c > b) && (c > d)) {
            System.out.println("c is greatest..");
        } else {
            System.out.println("d is greatest..");
        }

    }
}
