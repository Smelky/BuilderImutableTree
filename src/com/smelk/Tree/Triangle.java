package com.smelk.Tree;

class Triangle extends Figures {

    String name;
    int corners;
    int area;

    public Triangle(String name, int corners, int area) {
        this.name = name;
        this.corners = corners;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getCorners() {
        return corners;
    }

    public int getArea() {
        return area;
    }
}
