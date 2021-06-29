package com.company;

public class LeftPocket {
    Coins coins;

    public LeftPocket() {
    }

    public LeftPocket(Coins ringing) {
        this.coins = ringing;
    }

    public Coins getRinging() {
        return coins;
    }

    @Override
    public String toString() {
        return "В левом кормане что-то звенит " + coins.sound() + "\n";
    }
}
