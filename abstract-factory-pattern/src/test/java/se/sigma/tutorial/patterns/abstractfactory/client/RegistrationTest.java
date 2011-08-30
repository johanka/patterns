package se.sigma.tutorial.patterns.abstractfactory.client;

import org.junit.Test;
import se.sigma.tutorial.patterns.abstractfactory.Car;
import se.sigma.tutorial.patterns.abstractfactory.CarFactory;
import se.sigma.tutorial.patterns.abstractfactory.impl.HeavyCar;
import se.sigma.tutorial.patterns.abstractfactory.impl.HeavyCarFactory;

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
}