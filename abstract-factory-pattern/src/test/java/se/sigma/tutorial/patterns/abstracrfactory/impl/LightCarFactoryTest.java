package se.sigma.tutorial.patterns.abstracrfactory.impl;

import org.junit.Test;
import se.sigma.patterns.abstractfactory.Car;
import se.sigma.patterns.abstractfactory.CarFactory;
import se.sigma.tutorial.patterns.abstractfactory.impl.LightCar;
import se.sigma.tutorial.patterns.abstractfactory.impl.LightCarFactory;

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