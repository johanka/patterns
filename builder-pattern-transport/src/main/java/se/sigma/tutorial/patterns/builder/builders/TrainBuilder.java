package se.sigma.tutorial.patterns.builder.builders;

public class TrainBuilder extends AbstractTransportBuilder {

    private static final String TYPE = "Train";
    private static final String MODEL = "X2";
    private static final String TIME_PLAN = "Stockholm - Gbg";

    @Override
    public void buildType() {
        transport.setType(TYPE);
    }

    @Override
    public void buildModel() {
        transport.setModel(MODEL);
    }

    @Override
    public void buildTimePlan() {
        transport.setTimePlan(TIME_PLAN);
    }
}