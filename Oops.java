class Rectangle {
    int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Area of rectangle is:" + (length * width));
    }
}

public class Oops {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(5, 3);
       

    }
}
