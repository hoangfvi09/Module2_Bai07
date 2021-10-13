package BT1.Shape;

import BT1.Resizeable;

public class Square implements Resizeable {
    private double side=5;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    @Override
    public void resize(double percent) {
        side*=1+percent/100;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
