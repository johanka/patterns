package se.sigma.tutorial.patterns.builder.builders;

import se.sigma.tutorial.patterns.builder.Transport;

abstract class AbstractTransportBuilder {
    protected Transport transport;

    public void createNewTransport() {
        transport = new Transport();
    }


    public Transport getTransport() {
        return transport;
    }

    public void buildType() {
    }

    public void buildModel() {
    }

    public void buildTimePlan() {
    }
}