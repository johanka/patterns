package se.sigma.tutorial.patterns.factorymethod.sessions.impl;

import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;

public class RunningSession implements TrainingSession {
    private final String SESSION_TYPE = "running";

    public String getType() {
        return SESSION_TYPE;
    }
}