package com.company;

public class Book extends AbstractFlat{
    public Book() {
    }

    public Book(int length, int width) {
        super(length, width);
    }

    @Override
    public String toString() {
        return "Книга";
    }
}
