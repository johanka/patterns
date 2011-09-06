package se.sigma.tutorial.patterns.factorymethod.creator.impl;

import org.junit.Test;
import se.sigma.tutorial.patterns.factorymethod.creator.SessionCreator;
import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RunningSessionCreatorTest {
    @Test
    public void testCreateRunningSession() {
        String expectedTrainingType = "running";
        SessionCreator runningSession = new RunningSessionCreator();
        TrainingSession trainingSession = runningSession.createSession();

        String actualTrainingType = trainingSession.getType();

        assertThat(actualTrainingType, is(expectedTrainingType));
    }
}