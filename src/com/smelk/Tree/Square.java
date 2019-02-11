package com.smelk.Tree;

class Square extends Figures {

    String name;
    int corners;
    int perimeter;

    public Square(String name, int corners, int perimeter) {
        this.name = name;
        this.corners = corners;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public int getCorners() {
        return corners;
    }
}
