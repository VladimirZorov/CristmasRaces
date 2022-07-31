package main.java.christmasRaces.entities.cars;

import main.java.christmasRaces.common.ExceptionMessages;

public class MuscleCar implements Car {
    @Override
    public String getModel() {
        return getModel();
    }

    @Override
    public int getHorsePower() {

        return if (getHorsePower() <= 600 && getHorsePower()>= 400){
            return getHorsePower();
        } else {
            System.out.println(ExceptionMessages.INVALID_HORSE_POWER);
        };
    }

    @Override
    public double getCubicCentimeters() {
        return getCubicCentimeters();
    }

    @Override
    public double calculateRacePoints(int laps) {
        return (getCubicCentimeters() / getHorsePower()) * laps;
    }
}
