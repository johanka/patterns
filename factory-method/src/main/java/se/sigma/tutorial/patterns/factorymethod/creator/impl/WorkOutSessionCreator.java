package se.sigma.tutorial.patterns.factorymethod.creator.impl;

import se.sigma.tutorial.patterns.factorymethod.creator.SessionCreator;
import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;
import se.sigma.tutorial.patterns.factorymethod.sessions.impl.WorkOutSession;

public class WorkOutSessionCreator extends SessionCreator {
    private TrainingSession workOutSession;

    @Override
    public TrainingSession createSession() {
        this.workOutSession = new WorkOutSession();
        return workOutSession;
    }
}