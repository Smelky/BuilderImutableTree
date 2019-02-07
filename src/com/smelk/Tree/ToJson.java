package com.smelk.Tree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ToJson {

    static String tab = "  ";

    static void writeToJson(File file) {
        StringBuilder groupToJson = javaToJsonFromGroupPentagon();

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(groupToJson.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(groupToJson);
    }

    private static StringBuilder javaToJsonFromGroupPentagon() {
        StringBuilder jsonReturn = new StringBuilder();
        jsonReturn.append("{\n");
        jsonReturn.append(tab + "\"name\":\"Group\":[\n");
        jsonReturn.append(tab + tab +"{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + Group.name + "\",\n" );
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + Group.pentagonCorners + "\"\n" );
        jsonReturn.append(tab + tab +"},\n");
        javaToJsonFromGroupCircle(jsonReturn);
        return jsonReturn;
    }

    private static StringBuilder javaToJsonFromGroupCircle(StringBuilder jsonReturn) {
        jsonReturn.append(tab + tab +"{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + Group.circle.name + "\",\n" );
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + Group.circle.corners + "\"\n" );
        jsonReturn.append(tab + tab +"},\n");
        javaToJsonFromGroupSquare(jsonReturn);
        return jsonReturn;
    }

    private static StringBuilder javaToJsonFromGroupSquare(StringBuilder jsonReturn) {
        jsonReturn.append(tab + tab +"{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + Group.square.name + "\",\n" );
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + Group.square.corners + "\"\n" );
        jsonReturn.append(tab + tab +"},\n");
        javaToJsonFromGroupTriangle(jsonReturn);
        return jsonReturn;
    }

    private static StringBuilder javaToJsonFromGroupTriangle(StringBuilder jsonReturn) {
        jsonReturn.append(tab + tab +"{\n");
        jsonReturn.append(tab + tab + "\"name\":" + "\"" + Group.triangle.name + "\",\n" );
        jsonReturn.append(tab + tab + "\"corners\":" + "\"" + Group.triangle.corners + "\"\n" );
        jsonReturn.append(tab + tab +"}\n");
        jsonReturn.append(tab +"]\n");
        jsonReturn.append("}\n");
        return jsonReturn;
    }

}
