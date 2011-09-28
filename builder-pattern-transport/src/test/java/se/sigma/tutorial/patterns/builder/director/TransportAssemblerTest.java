package se.sigma.tutorial.patterns.builder.director;

import org.junit.Before;
import org.junit.Test;
import se.sigma.tutorial.patterns.builder.Transport;
import se.sigma.tutorial.patterns.builder.builders.TransportBuilder;
import se.sigma.tutorial.patterns.builder.builders.BusBuilder;
import se.sigma.tutorial.patterns.builder.builders.TrainBuilder;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransportAssemblerTest {
    private TransportAssembler transportAssembler;

    @Before
    public void setUp() {
        transportAssembler = new TransportAssembler();
    }

    @Test
    public void testBuildTrain() {
        TransportBuilder builder = new TrainBuilder();

        Transport transport = buildTransport(builder);

        assertThat(transport.getType(), is("Train"));
        assertThat(transport.getModel(), is("X2"));
        assertThat(transport.getTimePlan(), is("Stockholm - Gbg"));
    }

    @Test
    public void testBuildBus() {
        TransportBuilder builder = new BusBuilder();

        Transport transport = buildTransport(builder);

        assertThat(transport.getType(), is("Bus"));
        assertThat(transport.getModel(), is("Volvo B58"));
        assertThat(transport.getTimePlan(), is("Sqrubben - Trondheim"));
    }

    private Transport buildTransport(TransportBuilder builder) {
        transportAssembler.setTransportBuilder(builder);
        return transportAssembler.buildTransport();
    }
}