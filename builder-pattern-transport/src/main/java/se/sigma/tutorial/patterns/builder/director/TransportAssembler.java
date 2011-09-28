package se.sigma.tutorial.patterns.builder.director;

import se.sigma.tutorial.patterns.builder.Transport;
import se.sigma.tutorial.patterns.builder.builders.TransportBuilder;

public class TransportAssembler {
    private TransportBuilder builder;

    public void setTransportBuilder(TransportBuilder builder) {
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