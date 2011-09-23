package se.sigma.tutorial.patterns.prototype.tire;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import org.junit.Test;
import se.sigma.tutorial.patterns.prototype.tire.impl.SnowAndMudTire;
import se.sigma.tutorial.patterns.prototype.tire.impl.SummerTire;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TireTest {

    private Tire expectedTire;
    private String expectedDimension;
    private boolean expectedSpike;
    private TireType type;

    @Test
    public void cloneAndGetWinterTire() {
        expectedTire = new SnowAndMudTire();
        expectedDimension = "205/55R16";
        expectedSpike = true;
        type = TireType.MUDANDSNOW;
        setTire(expectedTire, type, expectedDimension, expectedSpike);

        // SUT
        Tire actualTire = expectedTire.clone();

        controlClone(actualTire);
    }

    @Test
    public void cloneAndGetSummerTire() {
        expectedTire = new SummerTire();
        expectedDimension = "205/55R18";
        expectedSpike = false;
        type = TireType.SUMMER;
        setTire(expectedTire, type, expectedDimension, expectedSpike);

        // SUT
        Tire actualTire = expectedTire.clone();

        controlClone(actualTire);
    }

    public void setTire(Tire tire, TireType type, String dimension, boolean spike) {
        tire.setType(type);
        tire.setDimension(dimension);
        tire.setSpike(spike);
    }

    private void controlClone(Tire actualTire) {
        assertThat(actualTire.getDimension(), is(expectedDimension));
        assertThat(actualTire.getSpike(), is(expectedSpike));
        assertThat(actualTire.getType(), is(type));
    }
}
