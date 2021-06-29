package com.company;

public class TennisBall extends AbstractCircle{
    public TennisBall(double radius) {
        super(radius);
    }

    public TennisBall() {
    }

    @Override
    public String toString() {
        return "теннисный мячик";
    }
}
