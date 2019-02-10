package com.smelk.Tree;

public class ToJson {

    static String tab = "  ";

        static void writeToJson(Group group) {
        StringBuilder jsonReturn = new StringBuilder();

        for (int i = 0; i < group.figures.size(); i++) {
            if (i == 0) {
                jsonReturn.append("{\n");
            }
            if (group.figures.get(i) == group.getCircle()) {
                javaToJsonFromGroupCircle(group, jsonReturn);
            } else if (group.figures.get(i) == group.getSquare()) {
                javaToJsonFromGroupSquare(group, jsonReturn);
            } else if (group.figures.get(i) == group.getTriangle()) {
                javaToJsonFromGroupTriangle(group, jsonReturn);
            }
            if (i == group.figures.size() - 1) {
                jsonReturn.append("}\n");
            }
        }
            group.figuresInGroup();
        StringBuilder groupToJson = jsonReturn;

    }

    private static StringBuilder javaToJsonFromGroupCircle(Group group, StringBuilder jsonReturn) {
        jsonReturn.append(tab + "\"name\":\"Group\":[\n");
        jsonReturn.append(tab + tab + "{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + group.circle.getName() + "\",\n");
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + group.circle.getCorners() + "\"\n");
        jsonReturn.append(tab + tab + "\"radius\":" + "\"" + group.circle.getRadius() + "\"\n");
        jsonReturn.append(tab + tab + "},\n");
        return jsonReturn;
    }

    private static StringBuilder javaToJsonFromGroupSquare(Group group, StringBuilder jsonReturn) {
        jsonReturn.append(tab + tab + "{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + group.square.getName() + "\",\n");
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + group.square.getCorners() + "\"\n");
        jsonReturn.append(tab + tab + "\"perimeter\":" + "\"" + group.square.getPerimeter() + "\"\n");
        jsonReturn.append(tab + tab + "},\n");
        return jsonReturn;
    }

    private static StringBuilder javaToJsonFromGroupTriangle(Group group, StringBuilder jsonReturn) {
        jsonReturn.append(tab + tab + "{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + group.triangle.getName() + "\",\n");
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + group.triangle.getCorners() + "\"\n");
        jsonReturn.append(tab + tab + "\"area\":" + "\"" + group.triangle.getArea() + "\"\n");
        jsonReturn.append(tab + tab + "}\n");
        jsonReturn.append(tab + "]\n");
        return jsonReturn;
    }
}
