package com.company;

public class Paper {
    private boolean burn = true;

    public Paper() {
    }

    public Paper(boolean burn) {
        this.burn = burn;
    }

    public boolean isBurn() {
        return burn;
    }
}
