import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 2, 3, 65, 9, 8, 9 };
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the values for an array..");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}