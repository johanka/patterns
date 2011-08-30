package se.sigma.tutorial.patterns.abstractfactory.impl;

import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;

public class HeavyCarFactory implements CarFactory {

    public Car createCar() {
        return new HeavyCar();
    }
}