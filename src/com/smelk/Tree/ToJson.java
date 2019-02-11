package com.smelk.Tree;

import static com.smelk.Tree.Group.*;

public class ToJson {

    static String tab = "  ";

    static void writeToJson(Group group) {

        StringBuilder jsonReturn = new StringBuilder();
        Group.AnotherGroup anotherGroup = group.new AnotherGroup();

        int sizeOfGroup = group.figuresInGroup.size();
        anotherGroup.addFiguresInAnotherGroupToList();

        for (int i = 0; i <= group.figuresInGroup.size() - 1; ++i) {

            if (i == 0) {
                jsonReturn.append("{\n");
                jsonReturn.append(tab + "\"name\":\"Group\":[\n");
            }
            if (i == sizeOfGroup) {
                jsonReturn.append(tab + "],\n");
                jsonReturn.append(tab + "\"name\":\"anotherGroup\":[\n");
            }

            if (group.figuresInGroup.get(i) == group.getCircle()) {
                javaToJson(circle, jsonReturn);
            } else if (group.figuresInGroup.get(i) == group.getSquare()) {
                javaToJson(square, jsonReturn);
            } else if (group.figuresInGroup.get(i) == group.getTriangle()) {
                javaToJson(triangle, jsonReturn);
            } else if (group.figuresInGroup.get(i) == anotherGroup.getParallelogram()) {
                javaToJson(anotherGroup.parallelogram, jsonReturn);
            } else if (group.figuresInGroup.get(i) == anotherGroup.getCone()) {
                javaToJson(anotherGroup.cone, jsonReturn);
            } else if (group.figuresInGroup.get(i) == anotherGroup.getRhombus()) {
                javaToJson(anotherGroup.rhombus, jsonReturn);
            }

            if (i == group.figuresInGroup.size() - 1) {
                jsonReturn.append(tab + "}\n");
                jsonReturn.append("}\n");
            }
        }
        StringBuilder groupToJson = jsonReturn;
    }

    private static StringBuilder javaToJson(Figures figure, StringBuilder jsonReturn) {
        jsonReturn.append(tab + tab + "{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + figure.getName() + "\",\n");
        jsonReturn.append(tab + tab + "\"bulk\":" + "\"" + figure.getBulk() + "\"\n");
        jsonReturn.append(tab + tab + "\"side\":" + "\"" + figure.getSide() + "\"\n");
        jsonReturn.append(tab + tab + "\"height\":" + "\"" + figure.getHeight() + "\"\n");
        jsonReturn.append(tab + tab + "\"perimeter\":" + "\"" + figure.getPerimeter() + "\"\n");
        jsonReturn.append(tab + tab + "\"area\":" + "\"" + figure.getArea() + "\"\n");
        jsonReturn.append(tab + tab + "\"radius\":" + "\"" + figure.getRadius() + "\"\n");
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + figure.getCorners() + "\"\n");
        jsonReturn.append(tab + tab + "},\n");
        return jsonReturn;
    }
}
