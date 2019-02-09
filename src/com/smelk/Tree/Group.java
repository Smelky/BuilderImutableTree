package com.smelk.Tree;

import java.util.ArrayList;
import java.util.List;

class Group {

    static Circle circle = new Circle("Circle", 0);
    static Square square = new Square("Triangle", 4);
    static Triangle triangle = new Triangle("Triangle", 3);

    List<Object> figures = new ArrayList();

    public static Circle getCircle() {
        return circle;
    }

    public static Square getSquare() {
        return square;
    }

    public static Triangle getTriangle() {
        return triangle;
    }

    void figuresInGroup() {
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);

    }

}
