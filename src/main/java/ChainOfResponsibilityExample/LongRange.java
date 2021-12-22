package ChainOfResponsibilityExample;

public class LongRange extends FuelQuantityHandler{
    @Override
    public float calculateMaxFuelQuantity(FuelQuantityPlan fuelQuantityPlan) {
        fuelQuantityPlan.setFuelQuantity((float) (fuelQuantityPlan.getFuelQuantity() + (fuelQuantityPlan.getFlyingHours() - 7.5) * 0.6));
        System.out.println("Long Range Fuel Quantity Added");
        if (fuelQuantityPlan.getFlyingHours() > 7.5 && fuelQuantityPlan.getFlyingHours() <= 12.5 ) {
            return fuelQuantityPlan.getFuelQuantity();
        } else {
            return successor.calculateMaxFuelQuantity(fuelQuantityPlan);
        }
    }
}
