package com.smelk.Tree;

public class Rhombus extends Figures {

    String name;
    int corners;
    int side;

    public Rhombus(String name, int corners, int side) {
        this.name = name;
        this.corners = corners;
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public int getCorners() {
        return corners;
    }

    public int getSide() {
        return side;
    }
}
