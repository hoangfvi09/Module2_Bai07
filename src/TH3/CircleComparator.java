package TH3;

import TH2.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<TH2.Circle> {

    @Override
    public int compare(TH2.Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
