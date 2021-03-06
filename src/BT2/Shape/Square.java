package BT2.Shape;

import BT2.Colorable;

public class Square extends Shape implements Colorable {
    private double side=5;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color 4 sides");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
