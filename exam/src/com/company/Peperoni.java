package com.company;

public class Peperoni extends Pizza {
    private boolean isSpicy;
    private static int numberOfPizza;

    public Peperoni() {
        numberOfPizza++;
    }

    public Peperoni(boolean isSpicy) {
        this.isSpicy = isSpicy;
        numberOfPizza++;
    }

    public Peperoni(int price, double weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
        numberOfPizza++;
    }

    @Override
    public void cookPizza() {
        System.out.println("Готовится пицца пепперони №" + numberOfPizza);
    }
    @Override
    public String toString() {
        return "Цена : " + super.getPrice() + "c\nВес : " + getWeight() + "гр\n" + (this.isSpicy ?"Острый\n" :"Не острый\n");
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public static int getNumberOfPizza() {
        return numberOfPizza;
    }
}
