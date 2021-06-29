package com.company;

public class Folder extends AbstractFlat{
    public Folder() {
    }

    public Folder(int length, int width) {
        super(length, width);
    }

    @Override
    public String toString() {
        return "Папка";
    }
}
