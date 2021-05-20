package com.company;

public class Margarita extends Pizza{
    private boolean isMeat;
    private static int numberOfPizza;

    public Margarita() {
        numberOfPizza++;
    }

    public Margarita(boolean isMeat) {
        this.isMeat = isMeat;
        numberOfPizza++;
    }

    public Margarita(int price, double weight, boolean isMeat) {
        super(price, weight);
        this.isMeat = isMeat;
        numberOfPizza++;
    }
    @Override
    public void cookPizza() {
        System.out.println("Готовится пицца маргарита №" + numberOfPizza);
    }
    @Override
    public String toString() {
        return "Цена : " + getPrice() + "c\nВес : " + getWeight() + "гр\n" + (isMeat ? "С мясом\n":"Без мяса\n");
    }

    public boolean isMeat() {
        return isMeat;
    }

    public static int getNumberOfPizza() {
        return numberOfPizza;
    }
}
