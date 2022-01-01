package FactoryMethodExample;

public class Runway45R extends Runway{
    @Override
    protected void createRunway() {
        aircrafts.add(new SmallWeightAircraft().getFlights());
        aircrafts.add(new LargeWeightAircraft().getFlights());
        aircrafts.add(new HeavyWeightAircraft().getFlights());
        aircrafts.add(new SuperWeightAircraft().getFlights());
    }
}
