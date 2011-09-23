package se.sigma.tutorial.patterns.prototype.tire;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class Tire implements Cloneable {

    protected TireType type;
    protected String dimension;
    protected boolean spike;

    public Tire clone() {
        Tire clonedTire = null;
        try {
            clonedTire = (Tire) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedTire;
    }

    public abstract void setType(TireType type);

    public abstract void setDimension(String expectedDimension);

    public abstract void setSpike(boolean expectedSpike);

    public abstract String getDimension();

    public abstract boolean getSpike();

    public abstract TireType getType();
}
