package se.sigma.tutorial.patterns.factorymethod.creator;

import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;

public abstract class SessionCreator {
    public abstract TrainingSession createSession();
}