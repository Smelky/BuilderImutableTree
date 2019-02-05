package com.study.Tree;

import java.io.Serializable;

class Square implements Serializable {

    private int square;

    Square(int square) {
        this.square = square;
    }

    int getSquare() {
        return square;
    }
}
