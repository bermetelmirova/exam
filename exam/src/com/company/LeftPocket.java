package com.company;

public class LeftPocket {
    Ringing ringing;

    public LeftPocket() {
    }

    public LeftPocket(Ringing ringing) {
        this.ringing = ringing;
    }

    public Ringing getRinging() {
        return ringing;
    }

    @Override
    public String toString() {
        return "В левом кормане что-то звенит " + ringing.sound() + "\n";
    }
}
