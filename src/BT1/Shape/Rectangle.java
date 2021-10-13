package BT1.Shape;

import BT1.Resizeable;

public class Rectangle implements Resizeable {
    private double width=4;
    private double height=6;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void resize(double percent) {
        width*=1+percent/100;
        height*=1+percent/100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
