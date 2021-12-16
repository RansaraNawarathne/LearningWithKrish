package FactoryMethodExample;

public class Runway32L extends Runway{
    @Override
    protected void createRunway() {
        aircrafts.add(new SmallWeightAircraft().getFlights());
        aircrafts.add(new LargeWeightAircraft().getFlights());
    }
}
