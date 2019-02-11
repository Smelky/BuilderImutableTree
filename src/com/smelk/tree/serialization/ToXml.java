package com.smelk.tree.serialization;

import com.smelk.tree.Group;
import com.smelk.tree.figures.Circle;
import com.smelk.tree.figures.Figures;
import com.smelk.tree.figures.Square;
import com.smelk.tree.figures.Triangle;

public class ToXml {

    public static String javaToxml(Group group) {
        StringBuilder toXmlBuilder = new StringBuilder();
        toXmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        appendGroup(group, toXmlBuilder);
        return toXmlBuilder.toString();
    }

    private static void appendGroup(Group group, StringBuilder toXmlBuilder) {

        if (group.getGroups().size() != 0) {
            toXmlBuilder.append("<" + group.getClass().getSimpleName() + ">");
            toXmlBuilder.append("<figures>");
            for (Figures figure : group.getFigures()) {
                switch (figure.getClass().getSimpleName()) {
                    case "Circle":
                        appendCircle((Circle) figure, toXmlBuilder);
                        break;
                    case "Square":
                        appendSquare((Square) figure, toXmlBuilder);
                        break;
                    case "Triangle":
                        appendTriangle((Triangle) figure, toXmlBuilder);
                }
            }
        }

        if (group.getGroups().size() != 0) {
            toXmlBuilder.append("</figures>\n");
            toXmlBuilder.append("</" + group.getClass().getSimpleName() + ">");
            for (Group group1 : group.getGroups()) {
                appendGroup(group1, toXmlBuilder);
            }
        }
    }

    private static void appendCircle(Circle circle, StringBuilder toXmlBuilder) {
        toXmlBuilder.append("<circle>");
        toXmlBuilder.append("<radius>");
        toXmlBuilder.append(circle.getRadius());
        toXmlBuilder.append("</radius>");
        toXmlBuilder.append("</circle>");
    }

    private static void appendSquare(Square square, StringBuilder toXmlBuilder) {
        toXmlBuilder.append("<square>");
        toXmlBuilder.append("<corners>");
        toXmlBuilder.append(square.getCorners());
        toXmlBuilder.append("</corners>");
        toXmlBuilder.append("<perimeter>");
        toXmlBuilder.append(square.getPerimeter());
        toXmlBuilder.append("</perimeter>");
        toXmlBuilder.append("</square>");
    }

    private static void appendTriangle(Triangle triangle, StringBuilder toXmlBuilder) {
        toXmlBuilder.append("<triangle>");
        toXmlBuilder.append("<corners>");
        toXmlBuilder.append(triangle.getCorners());
        toXmlBuilder.append("</corners>");
        toXmlBuilder.append("<area>");
        toXmlBuilder.append(triangle.getArea());
        toXmlBuilder.append("</area>");
        toXmlBuilder.append("</triangle>");
    }
}
