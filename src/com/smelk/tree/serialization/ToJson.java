package com.smelk.tree.serialization;

import com.smelk.tree.Group;
import com.smelk.tree.figures.Circle;
import com.smelk.tree.figures.Figures;
import com.smelk.tree.figures.Square;
import com.smelk.tree.figures.Triangle;

public class ToJson {
    public static String javaToJson(Group group) {
        StringBuilder toJsonBuilder = new StringBuilder();

        appendGroup(group, toJsonBuilder);
        return toJsonBuilder.toString();
    }

    private static void appendGroup(Group group, StringBuilder toJsonBuilder) {
        toJsonBuilder.append("{");

        if(group.getFigures().size() != 0) {
            toJsonBuilder.append("\"figures\":[");
            for (Figures figure : group.getFigures()) {
                switch (figure.getClass().getSimpleName()) {
                    case "Circle":
                        appendCircle((Circle) figure, toJsonBuilder);
                        break;
                    case "Square":
                        appendSquare((Square) figure, toJsonBuilder);
                        break;
                    case "Triangle":
                        appendTriangle((Triangle) figure, toJsonBuilder);
                }
                toJsonBuilder.append(",");
            }
            toJsonBuilder.deleteCharAt(toJsonBuilder.length() - 1);
            toJsonBuilder.append("],");
        }
        if(group.getGroups().size() != 0) {
            toJsonBuilder.append("\"groups\":[");
            for (Group group1 : group.getGroups()) {
                appendGroup(group1, toJsonBuilder);
                toJsonBuilder.append(",");

            }
            toJsonBuilder.deleteCharAt(toJsonBuilder.length() - 1);
            toJsonBuilder.append("]");
        }
        toJsonBuilder.append("}");

    }

    private static void appendCircle(Circle circle, StringBuilder toJsonBuilder) {
        toJsonBuilder.append("{");
        toJsonBuilder.append("\"radius\":");
        toJsonBuilder.append(circle.getRadius());
        toJsonBuilder.append("}");
    }

    private static void appendSquare(Square square, StringBuilder toJsonBuilder) {
        toJsonBuilder.append("{");
        toJsonBuilder.append("\"corners\":");
        toJsonBuilder.append(square.getCorners());
        toJsonBuilder.append(",");
        toJsonBuilder.append("\"perimeter\":");
        toJsonBuilder.append(square.getPerimeter());
        toJsonBuilder.append("}");
    }

    private static void appendTriangle(Triangle triangle, StringBuilder toJsonBuilder) {
        toJsonBuilder.append("{");
        toJsonBuilder.append("\"corners\":");
        toJsonBuilder.append(triangle.getCorners());
        toJsonBuilder.append(",");
        toJsonBuilder.append("\"area\":");
        toJsonBuilder.append(triangle.getArea());
        toJsonBuilder.append("}");
    }
}