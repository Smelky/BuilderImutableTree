package com.smelk.tree.figures;

public class Square implements Figures {

    private int corners;
    private int perimeter;

    public Square(int corners, int perimeter) {
        this.corners = corners;
        this.perimeter = perimeter;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public int getCorners() {
        return corners;
    }
}