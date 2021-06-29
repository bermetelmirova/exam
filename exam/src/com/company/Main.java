package com.company;

public class Main {

    public static void main(String[] args) {
        Ringing ringing= new Ringing();
        Paper paper = new Paper();
        RightPocket rightPocket = new RightPocket(paper);
        LeftPocket leftPocket = new LeftPocket(ringing);
        System.out.println(rightPocket);
        System.out.println(leftPocket);

    }
}
