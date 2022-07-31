package main.java.christmasRaces.entities.cars;

import static main.java.christmasRaces.common.ExceptionMessages.INVALID_HORSE_POWER;

public class SportsCar extends Car{
    private static double cubicCentimeters = 3000;

    public SportsCar(String model, int horsePower) {
    super(model, valid(horsePower), cubicCentimeters);
    }
    private static int valid(int horsePower) {
        if (horsePower < 250 || horsePower > 450){
            throw new IllegalArgumentException(String.format(INVALID_HORSE_POWER, horsePower));
        }
        return horsePower;
    }
}