package FactoryMethodExample;

public class Runway35R extends Runway{
    @Override
    protected void createRunway() {
        aircrafts.add(new SmallWeightAircraft().getFlights());
        aircrafts.add(new LargeWeightAircraft().getFlights());
        aircrafts.add(new HeavyWeightAircraft().getFlights());
    }
}
