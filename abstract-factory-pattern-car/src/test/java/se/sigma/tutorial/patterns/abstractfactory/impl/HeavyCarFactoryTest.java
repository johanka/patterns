package se.sigma.tutorial.patterns.abstractfactory.impl;

import org.junit.Test;
import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HeavyCarFactoryTest {

    @Test
    public void testCreateHeavyCar() {
        CarFactory carFactory = new HeavyCarFactory();
        HeavyCar expectedCar = new HeavyCar();
        Car actualCar = carFactory.createCar();

        assertThat(actualCar, is(expectedCar.getClass()));
    }
}