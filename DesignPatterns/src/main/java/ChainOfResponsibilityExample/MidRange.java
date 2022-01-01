package ChainOfResponsibilityExample;

public class MidRange extends FuelQuantityHandler{
    @Override
    public float calculateMaxFuelQuantity(FuelQuantityPlan fuelQuantityPlan) {
        fuelQuantityPlan.setFuelQuantity((float) (fuelQuantityPlan.getFuelQuantity() + (fuelQuantityPlan.getFlyingHours()-5) * 0.4));
        System.out.println("Mid Range Fuel Quantity Added");
        if ( fuelQuantityPlan.getFlyingHours() > 5 && fuelQuantityPlan.getFlyingHours() <= 7.5 ) {
            return fuelQuantityPlan.getFuelQuantity();
        } else {
            return successor.calculateMaxFuelQuantity(fuelQuantityPlan);
        }
    }
}
