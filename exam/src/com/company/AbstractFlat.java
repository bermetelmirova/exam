package com.company;

public abstract class AbstractFlat {
    private int length;
    private int width;

    public AbstractFlat() {
    }

    public AbstractFlat(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Длина: " + length + "\nШирина: " + width + '\n';
    }
}
