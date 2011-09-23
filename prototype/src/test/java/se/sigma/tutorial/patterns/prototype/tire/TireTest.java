package se.sigma.tutorial.patterns.prototype.tire;

import org.junit.Test;
import se.sigma.tutorial.patterns.prototype.tire.impl.SnowAndMudTire;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TireTest {
    @Test
    public void cloneAndGetWinterTire() {
        Tire expectedTire = new SnowAndMudTire();
        expectedTire.setType(TireType.MUDANDSNOW);
        String expectedDimension = "205/55R16";
        expectedTire.setDimension(expectedDimension);
        boolean expectedSpike = true;
        expectedTire.setSpike(expectedSpike);

        Tire actualTire = expectedTire.clone();

        assertThat(actualTire.getDimension(), is(expectedDimension));
        assertThat(actualTire.getSpike(), is(expectedSpike));
        assertThat(actualTire.getType(), is(TireType.MUDANDSNOW));
    }
}
