package se.sigma.tutorial.patterns.factorymethod.sessions.impl;

import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;

public class WorkOutSession implements TrainingSession {
    private final String SESSION_TYPE = "workout";

    public String getType() {
        return SESSION_TYPE;
    }
}