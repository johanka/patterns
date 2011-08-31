package se.sigma.tutorial.patterns.builder.builders;

import org.junit.Test;
import se.sigma.tutorial.patterns.builder.Transport;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrainBuilderTest {
    private static final String TYPE = "Train";
    private static final String MODEL = "X2";
    private static final String TIME_PLAN = "Stockholm - Gbg";

    @Test
    public void testBuildX2Train() {
        AbstractTransportBuilder trainBuilder = new TrainBuilder();
        Transport transport = buildTrain(trainBuilder);

        assertThat(transport.getType(), is(TYPE));
        assertThat(transport.getModel(), is(MODEL));
        assertThat(transport.getTimePlan(), is(TIME_PLAN));
    }

    private Transport buildTrain(AbstractTransportBuilder trainBuilder) {
        trainBuilder.createNewTransport();
        trainBuilder.buildType();
        trainBuilder.buildModel();
        trainBuilder.buildTimePlan();
        return trainBuilder.getTransport();
    }
}