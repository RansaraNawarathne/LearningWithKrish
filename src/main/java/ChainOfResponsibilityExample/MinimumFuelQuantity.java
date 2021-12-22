package ChainOfResponsibilityExample;

public class MinimumFuelQuantity extends FuelQuantityHandler{
    @Override
    public float calculateMaxFuelQuantity(FuelQuantityPlan fuelQuantityPlan) {
        return successor.calculateMaxFuelQuantity(fuelQuantityPlan);
    }
}
