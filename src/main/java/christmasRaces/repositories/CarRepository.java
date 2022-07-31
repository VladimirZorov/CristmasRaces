package main.java.christmasRaces.repositories;

import main.java.christmasRaces.entities.cars.Car;

import java.util.Collection;

public class CarRepository implements main.java.christmasRaces.repositories.interfaces.Repository<main.java.christmasRaces.entities.cars.Car> {
    @Override
    public Car getByName(String name) {
        return null;
    }

    @Override
    public Collection<Car> getAll() {
        return null;
    }

    @Override
    public void add(Car model) {

    }

    @Override
    public boolean remove(Car model) {
        return false;
    }
}
