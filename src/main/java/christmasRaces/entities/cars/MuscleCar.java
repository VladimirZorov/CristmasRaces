package main.java.christmasRaces.entities.cars;

import static main.java.christmasRaces.common.ExceptionMessages.INVALID_HORSE_POWER;

public class MuscleCar extends BaseCar {

    private static double cubicCentimeters = 5000;

    public MuscleCar(String model, int horsePower) {
        super(model, horsePower, cubicCentimeters);
    }
    private static int valid(int horsePower) {
        if (horsePower < 400 || horsePower > 600){
            throw new IllegalArgumentException(String.format(INVALID_HORSE_POWER, horsePower));
        }
        return horsePower;
    }


}