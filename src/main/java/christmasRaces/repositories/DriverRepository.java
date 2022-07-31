package main.java.christmasRaces.repositories;

import main.java.christmasRaces.entities.drivers.Driver;

import java.util.Collection;

public class DriverRepository implements main.java.christmasRaces.repositories.interfaces.Repository<main.java.christmasRaces.entities.drivers.Driver> {
    @Override
    public Driver getByName(String name) {
        return null;
    }

    @Override
    public Collection<Driver> getAll() {
        return null;
    }

    @Override
    public void add(Driver model) {

    }

    @Override
    public boolean remove(Driver model) {
        return false;
    }
}
