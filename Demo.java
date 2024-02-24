import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        int a = 56;
        double b = 23.4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int n = sc.nextInt();
        System.out.println("The value of n is :" + n);
        System.out.print("Hello world..");
        System.out.println("I'm java developer..");
        System.out.println("The value of a is :" + a);
        System.out.println("The value of b is :" + b);
        if (n % 2 == 0) {
            System.out.println("Number is even..");
        } else {
            System.out.println("Number is odd..");
        }

        if ((a > b) && (a > n)) {
            System.out.println("A is greatest..");
        } else if ((b > a) && (b > n)) {
            System.out.println("B is greatest..");
        } else {
            System.out.println("N is greatest..");
        }
        
    }
}