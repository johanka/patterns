package se.sigma.tutorial.patterns.factorymethod.creator.impl;

import org.junit.Test;
import se.sigma.tutorial.patterns.factorymethod.creator.SessionCreator;
import se.sigma.tutorial.patterns.factorymethod.sessions.TrainingSession;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WorkOutSessionCreatorTest {

    @Test
    public void testCreateWorkOutSession() {
        String expectedTrainingType = "workout";
        SessionCreator workOutCreator = new WorkOutSessionCreator();
        TrainingSession trainingSession = workOutCreator.createSession();

        String actualTrainingType = trainingSession.getType();

        assertThat(actualTrainingType, is(expectedTrainingType));
    }
}