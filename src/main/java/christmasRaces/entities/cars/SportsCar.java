package main.java.christmasRaces.entities.cars;

import main.java.christmasRaces.common.ExceptionMessages;

public class SportsCar implements Car{
    SportsCar sportsCar = new SportsCar();
    public SportsCar() {

    }

    @Override
    public String getModel() {
        return getModel();
    }

    @Override
    public int getHorsePower()  {
        int hp = 0;
        if (getHorsePower() <= 450 && getHorsePower() >= 250) {
            hp = getHorsePower();
        } else {
            System.out.println(ExceptionMessages.INVALID_HORSE_POWER);
        }
        return hp;
    }

    @Override
    public double getCubicCentimeters() {
        return 3000;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return (getCubicCentimeters() / getHorsePower()) * laps;
    }
}
