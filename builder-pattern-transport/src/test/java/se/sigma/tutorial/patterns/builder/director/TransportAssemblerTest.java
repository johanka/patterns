package se.sigma.tutorial.patterns.builder.director;

import org.junit.Test;
import se.sigma.tutorial.patterns.builder.Transport;
import se.sigma.tutorial.patterns.builder.builders.AbstractTransportBuilder;
import se.sigma.tutorial.patterns.builder.builders.TrainBuilder;
import se.sigma.tutorial.patterns.builder.se.sigma.tutorial.patterns.builder.director.TransportAssembler;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransportAssemblerTest {

    @Test
    public void testBuildTrain() {
        TransportAssembler transportAssembler = new TransportAssembler();
        AbstractTransportBuilder builder = new TrainBuilder();

        transportAssembler.setTransportBuilder(builder);
        Transport transport = transportAssembler.buildTransport();

        assertThat(transport.getType(), is("Train"));
        assertThat(transport.getModel(), is("X2"));
        assertThat(transport.getTimePlan(), is("Stockholm - Gbg"));
    }
}