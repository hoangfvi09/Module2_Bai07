package BT2;

import BT2.Shape.Circle;
import BT2.Shape.Rectangle;
import BT2.Shape.Shape;
import BT2.Shape.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapesArray=new Shape[3];
        shapesArray[0]=new Circle();
        shapesArray[1]=new Rectangle();
        shapesArray[2]=new Square();
        for(int i=0;i<shapesArray.length;i++){
            System.out.println(shapesArray[i]);
            System.out.println("Area of Shape number "+i+": "+shapesArray[i].getArea());
            if(shapesArray[i] instanceof Square){
                ((Square) shapesArray[i]).howToColor();
            }
        }
    }
}
