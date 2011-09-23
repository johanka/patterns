package se.sigma.tutorial.patterns.prototype.tire.impl;

import se.sigma.tutorial.patterns.prototype.tire.Tire;
import se.sigma.tutorial.patterns.prototype.tire.TireType;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SummerTire extends Tire {
     @Override
    public void setType(TireType type) {
        this.type = type;
    }

    @Override
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public void setSpike(boolean spike) {
        this.spike = spike;
    }

    @Override
    public String getDimension() {
        return dimension;
    }

    @Override
    public boolean getSpike() {
        return spike;
    }

    @Override
    public TireType getType() {
        return type;
    }
}
