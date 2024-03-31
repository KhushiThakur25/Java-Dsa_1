public class Square {
   
        public static void printSquares() {
            for (int i = 1; i <= 10; i++) {
                int square = i * i;
                System.out.println("Square of " + i + " is: " + square);
            }
        }
    
        public static void main(String[] args) {
            printSquares();
        }
    
}

