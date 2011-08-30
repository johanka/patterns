package se.sigma.tutorial.patterns.abstractfactory.client;

import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;

public class Registration {
    private CarFactory carFactory;

    public void setCarFactory(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car registerNewCar() {
        return carFactory.createCar();
    }
}