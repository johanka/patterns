package se.sigma.tutorial.patterns.factorymethod.creator.impl;

import se.sigma.tutorial.patterns.factorymethod.creator.SessionCreator;
import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;
import se.sigma.tutorial.patterns.factorymethod.sessions.impl.RunningSession;

public class RunningSessionCreator extends SessionCreator {
    private TrainingSession runningSession;

    @Override
    public TrainingSession createSession() {
        runningSession = new RunningSession();
        return runningSession;
    }
}