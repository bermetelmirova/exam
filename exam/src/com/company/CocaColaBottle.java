package com.company;

public class CocaColaBottle extends AbstractCylinder{
    public CocaColaBottle() {
    }

    public CocaColaBottle(int height) {
        super(height);
    }

    @Override
    public String toString() {
        return "бутылка колы";
    }
}
