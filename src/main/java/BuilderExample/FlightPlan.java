package BuilderExample;

public class FlightPlan {

    private final String flightPath;
    private final Float distance;
    private final Double fuelQuantity;
    private final Boolean specialTransport;
    private final Integer totalWeight;

    public FlightPlan (Builder builder) {
        this.flightPath = builder.flightPath;
        this.distance = builder.distance;
        this.fuelQuantity = builder.fuelQuantity;
        this.specialTransport = builder.specialTransport;
        this.totalWeight = builder.totalWeight;
    }

    public static class Builder {
        private String flightPath;
        private Float distance;
        private Double fuelQuantity;
        private Boolean specialTransport;
        private Integer totalWeight;

        public FlightPlan Build () {
            return new FlightPlan(this);
        }

        public Builder ( String flightPath ) {
            this.flightPath = flightPath;
        }

        /*public Builder flightPath (String flightPath) {
            this.flightPath = flightPath;
            return this;
        }*/

        public Builder distance (Float distance) {
            this.distance = distance;
            return this;
        }

        public Builder fuelQuantity (Double fuelQuantity) {
            this.fuelQuantity = fuelQuantity;
            return this;
        }

        public Builder specialTransport (Boolean specialTransport) {
            this.specialTransport = specialTransport;
            return this;
        }

        public Builder totalWeight (Integer totalWeight) {
            this.totalWeight = totalWeight;
            return  this;
        }
    }

    @Override
    public String toString() {
        return "FlightPlan{" +
                "flightPath='" + flightPath + '\'' +
                ", distance=" + distance +
                ", fuelQuantity=" + fuelQuantity +
                ", specialTransport=" + specialTransport +
                ", totalWeight=" + totalWeight +
                '}';
    }
}
