import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] arr = new int[rows][cols];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the value for an array " + i + " " + j);
                int val = sc.nextInt();
                arr[i][j] = val;
            }
        }
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
