package se.sigma.tutorial.patterns.abstractfactory.impl;

import org.junit.Test;
import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;
import se.sigma.tutorial.patterns.abstractfactory.impl.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class LightCarFactoryTest {

    @Test
    public void testCreateCar() {
        CarFactory lightCarFactory = new LightCarFactory();
        Car actualLightCar = lightCarFactory.createCar();

        assertThat(actualLightCar, instanceOf(LightCar.class));
    }
}