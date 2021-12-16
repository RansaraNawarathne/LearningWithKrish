package BuilderExample;

public class FlightPlanTelescopic2 {

    private String flightPath;
    private Float distance;
    private Double fuelQuantity;
    private Boolean specialTransport;
    private Integer totalWeight;

    public FlightPlanTelescopic2(String flightPath, Float distance, Double fuelQuantity, Boolean specialTransport, Integer totalWeight) {
        this.flightPath = flightPath;
        this.distance = distance;
        this.fuelQuantity = fuelQuantity;
        this.specialTransport = specialTransport;
        this.totalWeight = totalWeight;
    }

    public FlightPlanTelescopic2 (String flightPath, Float distance, Double fuelQuantity, Boolean specialTransport) {
        this(flightPath, distance, fuelQuantity, specialTransport, null);
    }

    public FlightPlanTelescopic2 (String flightPath, Float distance, Double fuelQuantity) {
        this(flightPath, distance, fuelQuantity,null);
    }

    public FlightPlanTelescopic2 (String flightPath, Float distance) {
        this(flightPath, distance,null);
    }

    public  FlightPlanTelescopic2 (String flightPath) {
        this ( flightPath, null);
    }

    @Override
    public String toString() {
        return "FlightPlanTelescopic2{" +
                "flightPath='" + flightPath + '\'' +
                ", distance=" + distance +
                ", fuelQuantity=" + fuelQuantity +
                ", specialTransport=" + specialTransport +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
