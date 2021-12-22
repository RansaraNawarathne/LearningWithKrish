package ChainOfResponsibilityExample;

public class FuelQuantityPlan {
    private String flightPath;
    private float flyingHours;
    private float fuelQuantity;

    public void setFuelQuantity(float fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public FuelQuantityPlan(String flightPath, float flyingHours) {
        this.flightPath = flightPath;
        this.flyingHours = flyingHours;
    }

    public String getFlightPath() {
        return flightPath;
    }

    public float getFlyingHours() {
        return flyingHours;
    }

    public float getFuelQuantity() {
        return fuelQuantity;
    }
}
