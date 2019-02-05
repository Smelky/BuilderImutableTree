package com.study.Tree;

import java.io.Serializable;

class Triangle implements Serializable {

    private int triangle;

    Triangle(int triangle) {
        this.triangle = triangle;
    }

    int getTriangle() {
        return triangle;
    }
}
