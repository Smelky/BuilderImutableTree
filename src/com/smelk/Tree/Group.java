package com.smelk.Tree;

import java.util.ArrayList;
import java.util.List;

class Group {

    static Circle circle = new Circle("Circle", 0, 5);
    static Square square = new Square("Square", 4, 8);
    static Triangle triangle = new Triangle("Triangle", 3, 6);

    static List figuresInGroup = new ArrayList();

    static void addFiguresInGroupToList() {

        figuresInGroup.add(circle);
        figuresInGroup.add(square);
        figuresInGroup.add(triangle);

    }

    static Circle getCircle() {
        return circle;
    }

    static Square getSquare() {
        return square;
    }

    static Triangle getTriangle() {
        return triangle;
    }

    class AnotherGroup {

        Parallelogram parallelogram = new Parallelogram("Parallelogram", 4, 2);
        Rhombus rhombus = new Rhombus("Rhombus", 4, 5);
        Cone cone = new Cone("Cone", 1, 9);

        void addFiguresInAnotherGroupToList() {

            figuresInGroup.add(parallelogram);
            figuresInGroup.add(rhombus);
            figuresInGroup.add(cone);

        }

        public Parallelogram getParallelogram() {
            return parallelogram;
        }

        public Rhombus getRhombus() {
            return rhombus;
        }

        public Cone getCone() {
            return cone;

        }
    }
}
