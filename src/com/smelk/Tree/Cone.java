package com.smelk.Tree;

public class Cone extends Figures {

    String name;
    int corners;
    int bulk;

    public Cone(String name, int corners, int bulk) {
        this.name = name;
        this.corners = corners;
        this.bulk = bulk;
    }

    public String getName() {
        return name;
    }

    public int getCorners() {
        return corners;
    }

    public int getBulk() {
        return bulk;
    }
}
