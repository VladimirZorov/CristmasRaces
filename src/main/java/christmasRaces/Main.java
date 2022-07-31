package main.java.christmasRaces;

import main.java.christmasRaces.core.EngineImpl;
import main.java.christmasRaces.core.interfaces.Controller;
import main.java.christmasRaces.entities.cars.Car;
import main.java.christmasRaces.entities.drivers.Driver;
import main.java.christmasRaces.entities.races.Race;
import main.java.christmasRaces.io.ConsoleReader;
import main.java.christmasRaces.io.ConsoleWriter;
import main.java.christmasRaces.repositories.CarRepository;
import main.java.christmasRaces.repositories.DriverRepository;
import main.java.christmasRaces.repositories.RaceRepository;
import main.java.christmasRaces.repositories.interfaces.Repository;

public class Main {
    public static void main(String[] args) {
        Repository<Car> carRepository = new CarRepository();
        Repository<Race> raceRepository = new RaceRepository();
        Repository<Driver> driverRepository = new DriverRepository();

        Controller controller = new ControllerImpl(driverRepository, carRepository, raceRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();
    }
}
