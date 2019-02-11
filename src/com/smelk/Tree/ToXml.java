package com.smelk.Tree;

import java.lang.*;

import static com.smelk.Tree.Group.*;

class ToXml {

    static String tab = "   ";

    static void writeToXml(Group group) {
        StringBuilder xmlReturn = new StringBuilder();

        Group.AnotherGroup anotherGroup = group.new AnotherGroup();

        Group.addFiguresInGroupToList();
        int sizeOfGroup = group.figuresInGroup.size();
        anotherGroup.addFiguresInAnotherGroupToList();

        for (int i = 0; i <= group.figuresInGroup.size() - 1; i++) {
            if (i == 0) {
                xmlReturn.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
                xmlReturn.append(tab + "<Group>\n");
            }
            if (i == sizeOfGroup) {
                xmlReturn.append(tab + "</Group>\n");
                xmlReturn.append(tab + "<anotherGroup>\n");
            }

            if (group.figuresInGroup.get(i) == group.getCircle()) {
                javaToXml(circle, xmlReturn);
            } else if (group.figuresInGroup.get(i) == group.getSquare()) {
                javaToXml(square, xmlReturn);
            } else if (group.figuresInGroup.get(i) == group.getTriangle()) {
                javaToXml(triangle, xmlReturn);
            } else if (group.figuresInGroup.get(i) == anotherGroup.getParallelogram()) {
                javaToXml(anotherGroup.parallelogram, xmlReturn);
            } else if (group.figuresInGroup.get(i) == anotherGroup.getCone()) {
                javaToXml(anotherGroup.cone, xmlReturn);
            } else if (group.figuresInGroup.get(i) == anotherGroup.getRhombus()) {
                javaToXml(anotherGroup.rhombus, xmlReturn);
            }

            if (i == group.figuresInGroup.size() - 1) {
                xmlReturn.append(tab + "</anotherGroup>\n");
            }
        }
        StringBuilder groupToXml = xmlReturn;
    }

    private static StringBuilder javaToXml(Figures figure, StringBuilder xmlReturn) {
        xmlReturn.append(tab + tab + "<" + figure.getName() + ">\n");
        xmlReturn.append(tab + tab + tab + "<name>" + figure.getName() + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<corners>" + figure.getCorners() + "</corners>\n");
        xmlReturn.append(tab + tab + tab + "<radius>" + figure.getRadius() + "</radius>\n");
        xmlReturn.append(tab + tab + tab + "<area>" + figure.getArea() + "</area>\n");
        xmlReturn.append(tab + tab + tab + "<perimeter>" + figure.getPerimeter() + "</perimeter>\n");
        xmlReturn.append(tab + tab + tab + "<bulk>" + figure.getBulk() + "</bulk>\n");
        xmlReturn.append(tab + tab + tab + "<<height>" + figure.getHeight() + "</height>\n");
        xmlReturn.append(tab + tab + tab + "<side>" + figure.getSide() + "</side>\n");
        xmlReturn.append(tab + tab + "</" + figure.getName() + ">\n");
        return xmlReturn;
    }
}
