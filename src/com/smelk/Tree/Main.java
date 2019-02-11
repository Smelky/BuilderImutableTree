package com.smelk.Tree;


public class Main {

    public static void main(String[] args) {
        Group group = new Group();
        ToXml.writeToXml(group);
        ToJson.writeToJson(group);
    }
}
