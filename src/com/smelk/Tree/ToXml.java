package com.smelk.Tree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class ToXml {

    static String tab = "   ";

    static void writeToXml(File file) {
        StringBuilder groupToXml = javaToXmlFromGroupPentagon();

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(groupToXml.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder javaToXmlFromGroupPentagon() {
        StringBuilder xmlReturn = new StringBuilder();
        xmlReturn.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlReturn.append(tab + "<Group>\n");
        xmlReturn.append(tab + tab + "<" + Group.name + ">\n");
        xmlReturn.append(tab + tab + tab + "<name>" + Group.name + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<name>" + Group.pentagonCorners + "</name>\n");
        xmlReturn.append(tab + tab + "</" + Group.name + ">\n");
        javaToXmlFromGroupCircle(xmlReturn);
        return xmlReturn;

    }

    private static StringBuilder javaToXmlFromGroupCircle(StringBuilder xmlReturn) {
        xmlReturn.append(tab + tab +"<Circle>\n");
        xmlReturn.append(tab + tab + tab + "<name>" + Group.circle.getName() + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<corners>" + Group.circle.getCorners() + "</corners>\n");
        xmlReturn.append(tab + tab +"</Circle>\n");
        javaToXmlFromGroupSquare(xmlReturn);
        return xmlReturn;
    }

    private static StringBuilder javaToXmlFromGroupSquare(StringBuilder xmlReturn) {
        xmlReturn.append(tab + tab + "<Square>\n");
        xmlReturn.append(tab + tab + tab + "<name>" + Group.square.getName() + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<corners>" + Group.square.getCorners() + "</corners>\n");
        xmlReturn.append(tab + tab + "</Square>\n");
        javaToXmlFromGroupTriangle(xmlReturn);
        return xmlReturn;
    }

    private static StringBuilder javaToXmlFromGroupTriangle(StringBuilder xmlReturn) {
        xmlReturn.append(tab + tab + "<Triangle>\n");
        xmlReturn.append(tab + tab + tab + "<name>" + Group.triangle.getName() + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<corners>" + Group.square.getCorners() + "</corners>\n");
        xmlReturn.append(tab + tab + "</Triangle>\n");
        xmlReturn.append(tab + "</Group>\n");
        return xmlReturn;

    }
}
