package FactoryMethodExample;

public class SmallWeightAircraft extends Aircraft{

    @Override
    public String getFlights() {
        return "ATR 72-600, Bombardier CRJ700";
    }
}
