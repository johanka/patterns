package se.sigma.tutorial.patterns.abstractfactory.impl;

import se.sigma.patterns.abstractfactory.Car;
import se.sigma.patterns.abstractfactory.CarFactory;

public class LightCarFactory implements CarFactory{

    public Car createCar() {
        return new LightCar();
    }
}