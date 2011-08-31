package se.sigma.tutorial.patterns.builder.builders;

public class TrainBuilder extends TransportBuilder {

    private static final String TYPE = "Train";
    private static final String MODEL = "X2";
    private static final String TIME_PLAN = "Stockholm - Gbg";

    public void buildType() {
        transport.setType(TYPE);
    }

    public void buildModel() {
        transport.setModel(MODEL);
    }

    public void buildTimePlan() {
        transport.setTimePlan(TIME_PLAN);
    }
}