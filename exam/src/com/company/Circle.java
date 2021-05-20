package com.company;

public class Circle {
    private double radius;
    private static int countCircle;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        final double PI = 3.14;
        if (radius % 3 == 0) // т.к площади дробные остаток от деления не будет 0, поэтому
            countCircle++;// проверяю на кратность радиус
        return PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public static int getCountCircle() {
        return countCircle;
    }
}
