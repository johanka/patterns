package se.sigma.tutorial.patterns.factorymethod.creator;

import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class SessionCreator {
    public TrainingSession createSession() {
        throw new NotImplementedException();
    }
}