package se.sigma.tutorial.patterns.builder.builders;

import org.junit.Test;
import se.sigma.tutorial.patterns.builder.Transport;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BusBuilderTest {
    private static final String TYPE = "Bus";
    private static final String MODEL = "Volvo B58";
    private static final String TIME_PLAN = "Sqrubben - Trondheim";

    @Test
    public void testBuildVolvoBus() {
        TransportBuilder busBuilder = new BusBuilder();
        Transport transport = buildBus(busBuilder);

        assertThat(transport.getType(), is(TYPE));
        assertThat(transport.getModel(), is(MODEL));
        assertThat(transport.getTimePlan(), is(TIME_PLAN));
    }

    private Transport buildBus(TransportBuilder busBuilder) {
        busBuilder.createNewTransport();
        busBuilder.buildType();
        busBuilder.buildModel();
        busBuilder.buildTimePlan();
        return busBuilder.getTransport();
    }
}