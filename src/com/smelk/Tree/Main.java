package com.smelk.Tree;


import java.io.File;

public class Main {

    public static void main(String[] args) {
        File fileXml = new File("D:\\JavaToXml.xml");
        File fileJson = new File("D:\\JavaToJson.json");
        Group group = new Group();
        ToXml.writeToXml(fileXml);
        ToJson.writeToJson(fileJson);
    }
}
