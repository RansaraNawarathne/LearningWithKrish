package FactoryMethodExample;

public class LargeWeightAircraft extends Aircraft{

    @Override
    public String getFlights() {
        return "Airbus A320-100, Boeing 737-800";
    }
}
