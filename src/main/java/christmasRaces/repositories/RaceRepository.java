package main.java.christmasRaces.repositories;

import main.java.christmasRaces.entities.races.Race;

import java.util.Collection;

public class RaceRepository implements main.java.christmasRaces.repositories.interfaces.Repository<main.java.christmasRaces.entities.races.Race> {
    @Override
    public Race getByName(String name) {
        return null;
    }

    @Override
    public Collection<Race> getAll() {
        return null;
    }

    @Override
    public void add(Race model) {

    }

    @Override
    public boolean remove(Race model) {
        return false;
    }
}
