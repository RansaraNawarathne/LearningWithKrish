package BuilderExample;

public class FlightPlanTelescopic1 {

    private String flightPath;
    private Float distance;
    private Double fuelQuantity;
    private Boolean specialTransport;
    private Integer totalWeight;

    public FlightPlanTelescopic1 (String flightPath) {
        this.flightPath = flightPath;
    }

    public FlightPlanTelescopic1 (String flightPath, Float distance) {
        this(flightPath);
        this.distance = distance;
    }

    public FlightPlanTelescopic1 (String flightPath, Float distance, Double fuelQuantity) {
        this(flightPath, distance);
        this.fuelQuantity = fuelQuantity;
    }

    public FlightPlanTelescopic1 (String flightPath, Float distance, Double fuelQuantity, Boolean specialTransport) {
        this(flightPath, distance, fuelQuantity);
        this.specialTransport = specialTransport;
    }

    public FlightPlanTelescopic1(String flightPath, Float distance, Double fuelQuantity, Boolean specialTransport, Integer totalWeight) {
        this(flightPath, distance, fuelQuantity, specialTransport);
        this.totalWeight = totalWeight;
    }

    @Override
    public String toString() {
        return "FlightPlanTelescopic1{" +
                "flightPath='" + flightPath + '\'' +
                ", distance=" + distance +
                ", fuelQuantity=" + fuelQuantity +
                ", specialTransport=" + specialTransport +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
