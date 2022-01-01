package FactoryMethodExample;

public class HeavyWeightAircraft extends Aircraft{

    @Override
    public String getFlights() {
        return "Boeing 747-8, Boeing 747-8F";
    }
}
