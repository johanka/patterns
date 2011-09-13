package se.sigma.tutorial.patterns.abstractfactory.impl;

import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;

public class LightCarFactory extends CarFactory {
    public Car createCar() {
        return new LightCar();
    }
}