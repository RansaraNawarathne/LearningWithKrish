package ChainOfResponsibilityExample;

public abstract class FuelQuantityHandler {

    protected FuelQuantityHandler successor;

    public void setSuccessor(FuelQuantityHandler successor) {
        this.successor = successor;
    }

    public abstract float calculateMaxFuelQuantity (FuelQuantityPlan fuelQuantityPlan);
}
