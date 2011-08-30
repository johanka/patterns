package se.sigma.tutorial.patterns.abstractfactory.client;

import org.junit.Test;
import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;
import se.sigma.tutorial.patterns.abstractfactory.impl.HeavyCar;
import se.sigma.tutorial.patterns.abstractfactory.impl.HeavyCarFactory;
import se.sigma.tutorial.patterns.abstractfactory.impl.LightCar;
import se.sigma.tutorial.patterns.abstractfactory.impl.LightCarFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RegistrationTest {

    @Test
    public void testCreateHeavyCar() {
        Car expectedCar = new HeavyCar();
        CarFactory heavyCarFactory = new HeavyCarFactory();
        Registration registration = new Registration();

        registration.setCarFactory(heavyCarFactory);
        Car actualCar = registration.registerNewCar();

        assertThat(actualCar, is(expectedCar.getClass()));
    }

    @Test
    public void testCreateLightCar() {
        Car expectedCar = new LightCar();
        CarFactory lightCarFactory = new LightCarFactory();
        Registration registration = new Registration();

        registration.setCarFactory(lightCarFactory);
        Car actualCar = registration.registerNewCar();

        assertThat(actualCar, is(expectedCar.getClass()));
    }
}