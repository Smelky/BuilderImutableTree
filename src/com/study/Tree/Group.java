package com.study.Tree;

class Group {

    private static int pentagon = 5;

    private static Circle circle = new Circle(0);
    private static Square square = new Square(4);
    private static Triangle triangle = new Triangle(3);

    static void showFigures () {
        System.out.println(circle.getCircle());
        System.out.println(square.getSquare());
        System.out.println(triangle.getTriangle());
        System.out.println(pentagon);
    }

}
