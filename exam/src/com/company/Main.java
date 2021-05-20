package com.company;

public class Main {

    public static void main(String[] args) {
        Peperoni peperoni = new Peperoni(250, 200, true);
        peperoni.cookPizza();
        peperoni.deliverPizza();

        Margarita margarita = new Margarita(220, 250, false);
        margarita.cookPizza();
        margarita.deliverPizza();
        LaFinta laFinta = new LaFinta(300, 500, true);
        laFinta.cookPizza();
        laFinta.deliverPizza();
    }
}
