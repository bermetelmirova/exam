package com.company;

import java.util.Arrays;

public class Bag {
    AbstractFlat somethingFlat;
    AbstractCylinder somethingCylinder;
    AbstractCircle aLotOfThingCircle[];

    public Bag() {
    }

    public Bag(AbstractFlat somethingFlat, AbstractCylinder somethingCylinder, AbstractCircle[] aLotOfThingCircle) {
        this.somethingFlat = somethingFlat;
        this.somethingCylinder = somethingCylinder;
        this.aLotOfThingCircle = aLotOfThingCircle;
    }

    public AbstractFlat getSomethingFlat() {
        return somethingFlat;
    }

    public AbstractCylinder getSomethingCylinder() {
        return somethingCylinder;
    }

    public AbstractCircle[] getALotOfThingCircle() {
        return aLotOfThingCircle;
    }

    @Override
    public String toString() {
        return "В рюкзаке у нас:\nчто-то плоское:" + somethingFlat + "\nчто-то цилиндрическое: " + somethingCylinder + "\nи немного круглых вещей: " + Arrays.toString(aLotOfThingCircle) + '\n';
    }
}
