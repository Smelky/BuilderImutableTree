package com.smelk.Tree;

class ToXml {

    static String tab = "   ";

    static void writeToXml(Group group) {
        StringBuilder xmlReturn = new StringBuilder();
        group.figuresInGroup();

        for (int i = 0; i < group.figures.size(); i++) {
            if (i == 0) {
                xmlReturn.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
                xmlReturn.append(tab + "<Group>\n");
            }
            if (group.figures.get(i) == group.getCircle()) {
                javaToXmlFromGroupCircle(group, xmlReturn);
            } else if (group.figures.get(i) == group.getSquare()) {
                javaToXmlFromGroupSquare(group, xmlReturn);
            } else if (group.figures.get(i) == group.getTriangle()) {
                javaToXmlFromGroupTriangle(group, xmlReturn);
            }
            if (i == group.figures.size() - 1) {
                xmlReturn.append(tab + "</Group>\n");
            }
        }
        StringBuilder groupToXml = xmlReturn;
    }

    private static StringBuilder javaToXmlFromGroupCircle(Group group, StringBuilder xmlReturn) {
        xmlReturn.append(tab + tab + "<Circle>\n");
        xmlReturn.append(tab + tab + tab + "<name>" + group.circle.getName() + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<corners>" + group.circle.getCorners() + "</corners>\n");
        xmlReturn.append(tab + tab + "</Circle>\n");
        return xmlReturn;
    }

    private static StringBuilder javaToXmlFromGroupSquare(Group group, StringBuilder xmlReturn) {
        xmlReturn.append(tab + tab + "<Square>\n");
        xmlReturn.append(tab + tab + tab + "<name>" + group.square.getName() + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<corners>" + group.square.getCorners() + "</corners>\n");
        xmlReturn.append(tab + tab + "</Square>\n");
        return xmlReturn;
    }

    private static StringBuilder javaToXmlFromGroupTriangle(Group group, StringBuilder xmlReturn) {
        xmlReturn.append(tab + tab + "<Triangle>\n");
        xmlReturn.append(tab + tab + tab + "<name>" + group.triangle.getName() + "</name>\n");
        xmlReturn.append(tab + tab + tab + "<corners>" + group.square.getCorners() + "</corners>\n");
        xmlReturn.append(tab + tab + "</Triangle>\n");
        return xmlReturn;
    }
}
