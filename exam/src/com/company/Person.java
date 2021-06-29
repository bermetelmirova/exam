package com.company;

public class Person {
    private LeftPocket leftPocket;
    private RightPocket rightPocket;

    public Person() {
    }

    public Person(LeftPocket leftPocket, RightPocket rightPocket) {
        this.leftPocket = leftPocket;
        this.rightPocket = rightPocket;
    }

    public LeftPocket getLeftPocket() {
        return leftPocket;
    }

    public RightPocket getRightPocket() {
        return rightPocket;
    }

    @Override
    public String toString() {
        return leftPocket + "" + rightPocket + '\n';
    }
}
