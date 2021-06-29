package com.company;

public abstract class AbstractCircle {
    private double radius;

    public AbstractCircle(double radius) {
        this.radius = radius;
    }

    public AbstractCircle() {
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Радиус: " + radius + '\n';
    }
}
