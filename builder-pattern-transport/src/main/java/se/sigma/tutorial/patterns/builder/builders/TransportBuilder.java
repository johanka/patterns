package se.sigma.tutorial.patterns.builder.builders;

import se.sigma.tutorial.patterns.builder.Transport;

public abstract class TransportBuilder {
    protected Transport transport;

    public void createNewTransport() {
        transport = new Transport();
    }

    public Transport getTransport() {
        return transport;
    }

    public abstract void buildType();

    public abstract void buildModel();

    public abstract void buildTimePlan();
}