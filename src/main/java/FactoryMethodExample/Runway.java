package FactoryMethodExample;

import java.util.ArrayList;
import java.util.List;

public abstract class Runway {
    protected List<String> aircrafts = new ArrayList<>();

    public Runway () {
        createRunway();
    }

    protected abstract void createRunway ();

    @Override
    public String toString() {
        return "Runway{" +
                "aircrafts=" + aircrafts +
                '}';
    }
}
