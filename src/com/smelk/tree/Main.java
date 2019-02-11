package com.smelk.tree;

import com.smelk.tree.figures.Circle;
import com.smelk.tree.figures.Square;
import com.smelk.tree.figures.Triangle;
import com.smelk.tree.serialization.ToJson;
import com.smelk.tree.serialization.ToXml;

public class Main {

    public static void main(String[] args) {
        Group group = new Group();

        group.addFigures(new Circle(4.3));
        group.addFigures(new Circle(5.2));
        group.addFigures(new Circle(8.3));

        group.addFigures(new Square(4, 18));
        group.addFigures(new Square(4, 12));


        group.addFigures(new Triangle(3, 7));
        group.addFigures(new Triangle(3, 4));

        Group group1 = new Group();

        group1.addFigures(new Circle(6.2));
        group1.addFigures(new Circle(9.4));

        group1.addFigures(new Square(4, 11));
        group1.addFigures(new Square(4, 43));

        group1.addFigures(new Triangle(3, 87));
        group1.addFigures(new Triangle(3, 24));
        group1.addFigures(new Triangle(3, 90));

        group.addGroup(group1);

        System.out.println(ToXml.javaToxml(group));
    }
}
