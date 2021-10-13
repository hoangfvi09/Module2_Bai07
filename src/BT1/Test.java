package BT1;

import BT1.Shape.Rectangle;
import BT1.Shape.Square;
import BT1.Shape.Triangle;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        System.out.println("Before resizing: ");
        System.out.println(triangle);
        System.out.println(square);
        System.out.println(rectangle);
        triangle.resize(30);
        square.resize(50);
        rectangle.resize(100);
        System.out.println("After resizing:");
        System.out.println(triangle);
        System.out.println(square);
        System.out.println(rectangle);
    }


}
