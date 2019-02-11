package com.smelk.Tree;

public class Parallelogram extends Figures {

    String name;
    int corners;
    int height;

    public Parallelogram(String name, int corners, int height) {
        this.name = name;
        this.corners = corners;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getCorners() {
        return corners;
    }

    public int getHeight() {
        return height;
    }
}
