package ChainOfResponsibilityExample;

public class IntercontinentalRange extends FuelQuantityHandler{
    @Override
    public float calculateMaxFuelQuantity(FuelQuantityPlan fuelQuantityPlan) {
        fuelQuantityPlan.setFuelQuantity((float) (fuelQuantityPlan.getFuelQuantity() + (fuelQuantityPlan.getFlyingHours() - 12.5) * 0.8));
        System.out.println("Intercontinental Range Fuel Quantity Added");
        return fuelQuantityPlan.getFuelQuantity();
    }
}
