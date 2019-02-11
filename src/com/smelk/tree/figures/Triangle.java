package com.smelk.tree.figures;

public class Triangle implements Figures {

    private int corners;
    private int area;

    public Triangle(int corners, int area) {
        this.corners = corners;
        this.area = area;
    }

    public int getCorners() {
        return corners;
    }

    public int getArea() {
        return area;
    }
}