package se.sigma.tutorial.patterns.abstractfactory.impl;

import org.junit.Test;
import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class HeavyCarFactoryTest {

    @Test
    public void testCreateHeavyCar() {
        CarFactory carFactory = new HeavyCarFactory();
        Car actualCar = carFactory.createCar();

        assertThat(actualCar, instanceOf(HeavyCar.class));
    }
}