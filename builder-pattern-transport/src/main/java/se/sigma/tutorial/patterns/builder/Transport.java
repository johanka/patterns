package se.sigma.tutorial.patterns.builder;

public class Transport {
    private String type;
    private String model;
    private String timePlan;

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTimePlan(String timePlan) {
        this.timePlan = timePlan;
    }

    public String getModel() {
        return model;
    }

    public String getTimePlan() {
        return timePlan;
    }

    public String getType() {
        return type;
    }
}