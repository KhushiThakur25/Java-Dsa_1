import java.util.Scanner;

public class Operators {
    // Arithmetic Operators
    // Unary Operators - single operand
    // Assignment Operators
    // Relational Operators
    // Logical Operators
    // Ternary Operators - 3 operands
    // Bitwise Operators
    // Shift Operators
    // instance of Operators
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 65;
        // Arithmetic operator
        System.out.println("a + b is:" + " " + (a + b));
        System.out.println("a - b is:" + " " + (a - b));
        System.out.println("a * b is:" + " " + (a * b));
        System.out.println("a / b is:" + " " + (a / b));
        System.out.println("a % b is:" + " " + (a % b));
        // Unary Operator
        // Pre-Increment ++a
        // post-Increment a++
        // Pre-Decrement --a
        // Post-Decrement a--
        System.out.println("Pre increment is:" + " " + (++a));
        System.out.println("Post increment is:" + " " + (a++));
        System.out.println("Pre decrement is:" + " " + (--a));
        System.out.println("Post decrement is:" + " " + (a--));
        System.out.println(a);
        // Relational Operators
        // relation check == , <= , >= , != , > , <
        if (a == b) {
            System.out.println("a is equal to b..");
        }
        // Logical Operators
        // AND(&&)-it returns true if both conditions , OR(||)-returns true if at least
        // one is true , NOT(!) - true changes to false ..vice -versa
        if ((a < b) && (a < c)) {
            System.out.println("a is smaller ..");
        } else {
            System.out.println("a is not smaller");
        }

    }

}
