package se.sigma.tutorial.patterns.builder.builders;

public class TrainBuilder extends AbstractTransportBuilder{

    public void buildType(String type) {
        transport.setType(type);
    }

    public void buildModel(String model) {
        transport.setModel(model);
    }

    public void buildTimePlan(String timePlan) {
        transport.setTimePlan(timePlan);
    }
}