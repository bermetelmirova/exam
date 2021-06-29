package com.company;

public class WaterBottle extends AbstractCylinder{
    public WaterBottle() {
    }

    public WaterBottle(int height) {
        super(height);
    }

    @Override
    public String toString() {
        return "бутылка воды";
    }
}
