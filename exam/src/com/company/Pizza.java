package com.company;

public class Pizza {
    private int price;
    private double weight;
    private static int numberOfPizza;

    public Pizza() {
    }

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
        numberOfPizza++;
    }

    public void cookPizza() {
        System.out.println("Готовится пицца №" + numberOfPizza);
    }

    @Override
    public String toString() {
        return "Цена : " + price + "c\nВес : " + weight + "гр\n";
    }

    public void deliverPizza() {
        System.out.printf("Доставка пиццы:\n" + toString()+ '\n');
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public static int getNumberOfPizza() {
        return numberOfPizza;
    }
}
