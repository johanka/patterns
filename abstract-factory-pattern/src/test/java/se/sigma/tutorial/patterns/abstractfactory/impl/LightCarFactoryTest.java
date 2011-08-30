package se.sigma.tutorial.patterns.abstractfactory.impl;

import org.junit.Test;
import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;
import se.sigma.tutorial.patterns.abstractfactory.impl.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LightCarFactoryTest {

    @Test
    public void testCreateCar() {
        CarFactory lightCarFactory = new LightCarFactory();
        LightCar expectedLightCar = new LightCar();
        Car actualLightCar = lightCarFactory.createCar();

        assertThat(actualLightCar, is(expectedLightCar.getClass()));
    }
}