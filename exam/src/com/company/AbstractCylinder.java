package com.company;

public abstract class AbstractCylinder {
    private int height;

    public AbstractCylinder() {
    }

    public AbstractCylinder(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Высота: " + height + '\n';
    }
}
