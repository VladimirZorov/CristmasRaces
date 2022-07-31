package main.java.christmasRaces.entities.cars;

import main.java.christmasRaces.common.ExceptionMessages;

public class MuscleCar implements Car {

    public MuscleCar() {
    }

    @Override
    public String getModel() {
        return getModel();
    }

    @Override
    public int getHorsePower() {
        int hp = 0;
        if (getHorsePower() <= 600 && getHorsePower() >= 400) {
            hp = getHorsePower();
        } else {
            System.out.println(ExceptionMessages.INVALID_HORSE_POWER);
        }
        return hp;
    }

    @Override
    public double getCubicCentimeters() {
        return 5000;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return (getCubicCentimeters() / getHorsePower()) * laps;
    }
}
