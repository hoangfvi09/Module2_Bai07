package BT1.Shape;

import BT1.Resizeable;

public class Triangle implements Resizeable {
    private double sideNo1=4;
    private double sideNo2=4;
    private double sideNo3=4;

    public Triangle() {
    }

    public Triangle(double sideNo1, double sideNo2, double sideNo3) {
        this.sideNo1 = sideNo1;
        this.sideNo2 = sideNo2;
        this.sideNo3 = sideNo3;
    }

    @Override
    public void resize(double percent) {
        sideNo1*=1+percent/100;
        sideNo2*=1+percent/100;
        sideNo3*=1+percent/100;
    }

    @Override
    public String  toString() {
        return "Triangle{" +
                "sideNo1=" + sideNo1 +
                ", sideNo2=" + sideNo2 +
                ", sideNo3=" + sideNo3 +
                '}';
    }
}
