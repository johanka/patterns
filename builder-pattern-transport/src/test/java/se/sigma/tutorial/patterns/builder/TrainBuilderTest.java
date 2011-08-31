package se.sigma.tutorial.patterns.builder;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrainBuilderTest {

    @Test
    public void testBuildX2Train() {
        String type = "Train";
        String model = "X2";
        String timePlan = "Stockholm - Gbg";
        TrainBuilder trainBuilder = new TrainBuilder();

        trainBuilder.createNewTransport();
        trainBuilder.buildType(type);
        trainBuilder.buildModel(model);
        trainBuilder.buildTimePlan(timePlan);

        Transport transport = trainBuilder.getTransport();

        assertThat(transport.getType(), is(type));
        assertThat(transport.getModel(), is(model));
        assertThat(transport.getTimePlan(), is(timePlan));
    }
}