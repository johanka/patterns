package se.sigma.tutorial.patterns.builder;

public class TrainBuilder {
    private Transport transport;


    public void createNewTransport() {
        transport = new Transport();
    }

    public void buildType(String type) {
        transport.setType(type);
    }

    public void buildModel(String model) {
        transport.setModel(model);
    }

    public void buildTimePlan(String timePlan) {
        transport.setTimePlan(timePlan);
    }

    public Transport getTransport() {
        return transport;
    }
}