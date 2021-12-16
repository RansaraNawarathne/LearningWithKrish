package FactoryMethodExample;

public class Runway6L extends Runway{

    @Override
    protected void createRunway() {
        aircrafts.add(new SmallWeightAircraft().getFlights());
    }
}
