package com.company;

public class Main {

    public static void main(String[] args) {
        Coins coins= new Coins();
        Paper paper = new Paper();
        RightPocket rightPocket = new RightPocket(paper);
        LeftPocket leftPocket = new LeftPocket(coins);
        Person me = new Person(leftPocket,rightPocket);
        System.out.println(me);
    }
}
