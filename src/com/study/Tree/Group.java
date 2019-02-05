package com.study.Tree;

import java.io.Serializable;

class Group implements Serializable {

    private int pentagon = 5;

    private Circle circle = new Circle(0);
    private Square square = new Square(4);
    private Triangle triangle = new Triangle(3);

    void showFigures () {
        System.out.println("Circle has " + circle.getCircle() + " corners");
        System.out.println("Square has " + square.getSquare() + " corners");
        System.out.println("Triangles has " + triangle.getTriangle() + " corners");
        System.out.println("Pentagon has " + pentagon + " corners");
    }

}
