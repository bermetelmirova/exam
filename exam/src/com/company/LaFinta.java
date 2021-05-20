package com.company;

public class LaFinta extends Pizza {
    private boolean isMushrooms;
    private static int numberOfPizza;

    public LaFinta() {
        numberOfPizza++;
    }

    public LaFinta(boolean isMushrooms) {
        this.isMushrooms = isMushrooms;
        numberOfPizza++;
    }

    public LaFinta(int price, double weight, boolean isMushrooms) {
        super(price, weight);
        this.isMushrooms = isMushrooms;
        numberOfPizza++;
    }
    @Override
    public void cookPizza() {
        System.out.println("Готовится пицца Ла Финта №" + numberOfPizza);
    }
    @Override
    public String toString() {
        return "Цена : " + getPrice() + "c\nВес : " + getWeight() + "гр\n" + (isMushrooms ? "С грибами\n":"Без грибов\n");
    }

    public boolean isMushrooms() {
        return isMushrooms;
    }

    public static int getNumberOfPizza() {
        return numberOfPizza;
    }
}
