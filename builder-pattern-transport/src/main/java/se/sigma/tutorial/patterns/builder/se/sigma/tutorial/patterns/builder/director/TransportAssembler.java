package se.sigma.tutorial.patterns.builder.se.sigma.tutorial.patterns.builder.director;

import se.sigma.tutorial.patterns.builder.Transport;
import se.sigma.tutorial.patterns.builder.builders.AbstractTransportBuilder;

public class TransportAssembler {
    private Transport transport;
    private AbstractTransportBuilder builder;

    public void setTransportBuilder(AbstractTransportBuilder builder) {
        this.builder = builder;
    }

    public Transport buildTransport() {
        builder.createNewTransport();
        builder.buildType();
        builder.buildModel();
        builder.buildTimePlan();
        return builder.getTransport();
    }
}