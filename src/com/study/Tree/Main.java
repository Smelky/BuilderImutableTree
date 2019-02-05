package com.study.Tree;

import java.io.*;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable {

    public static void main(String[] args) {

        File file = new File("C:\\JavaToXml.xml");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaToXml.xml"))) {
            Group group = new Group();
            oos.writeObject(group);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
