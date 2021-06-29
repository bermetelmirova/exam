package com.company;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Apple[] apples = new Apple[20];
        for (int i = 0; i < 20; i++) {
            apples[i] = new Apple(random.nextInt(10) + 1);
        }
        Book book = new Book(20, 15);
        CocaColaBottle cocaColaBottle = new CocaColaBottle(20);
        WaterBottle waterBottle = new WaterBottle(20);
        Bag[] bags = new Bag[3];
        bags[0] = new Bag(book, cocaColaBottle, apples);
        TennisBall[] tennisBalls = new TennisBall[50];
        for (int i = 0; i < 50; i++) {
            tennisBalls[i] = new TennisBall(5);
        }
        Folder folder = new Folder(20, 15);
        bags[1] = new Bag(folder, waterBottle, tennisBalls);
        AbstractCircle[] circle = new AbstractCircle[13];
        for (int i = 0; i < 13; i++) {
            circle[i] = new Apple(random.nextInt(10) + 1);
            if (i >= 10) {
                circle[i] = new TennisBall(5);
            }
        }
        bags[2] = new Bag(folder, cocaColaBottle, circle);
        for (int i = 0; i < bags.length; i++) {
            System.out.println("№ " + (i + 1) + "\n" + bags[i]);
        }

    }
}
