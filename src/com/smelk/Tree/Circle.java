package com.smelk.Tree;

class Circle {

    String name;
    int corners;
    int radius;

    public Circle(String name, int corners, int radius) {
        this.name = name;
        this.corners = corners;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public int getCorners() {
        return corners;
    }

    public int getRadius() {
        return radius;
    }
}
