package se.sigma.tutorial.patterns.builder.builders;

public class BusBuilder extends AbstractTransportBuilder {
    private static final String TYPE = "Bus";
    private static final String MODEL = "Volvo B58";
    private static final String TIME_PLAN = "Sqrubben - Trondheim";

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