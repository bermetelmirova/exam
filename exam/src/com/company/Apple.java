package com.company;

public class Apple extends AbstractCircle{
    public Apple(double radius) {
        super(radius);
    }

    public Apple() {
    }

    @Override
    public String toString() {
        return "яблоко";
    }
}
