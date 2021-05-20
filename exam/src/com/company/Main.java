package com.company;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(i + 1);
            System.out.println("Радиус : " + circles[i].getRadius());
            System.out.println("Площадь : " + circles[i].findArea() + "\n");
        }
        System.out.println("Кол-во площадей кратных 3: " + Circle.getCountCircle());
    }
}
