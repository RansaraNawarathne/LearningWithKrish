package ChainOfResponsibilityExample;

public class ShortRange extends FuelQuantityHandler{
    @Override
    public float calculateMaxFuelQuantity(FuelQuantityPlan fuelQuantityPlan) {
        fuelQuantityPlan.setFuelQuantity((float) (fuelQuantityPlan.getFlyingHours() * 0.2));
        System.out.println("Short Range Fuel Quantity Added");
        if ( fuelQuantityPlan.getFlyingHours() <= 5) {
            return fuelQuantityPlan.getFuelQuantity();
        } else {
            return successor.calculateMaxFuelQuantity(fuelQuantityPlan);
        }
    }
}
