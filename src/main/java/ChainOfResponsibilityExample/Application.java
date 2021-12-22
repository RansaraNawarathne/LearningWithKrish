package ChainOfResponsibilityExample;

public class Application {
    public static void main(String[] args) {
        ShortRange shortRange = new ShortRange();
        MidRange midRange = new MidRange();
        LongRange longRange = new LongRange();
        IntercontinentalRange intercontinentalRange = new IntercontinentalRange();

        MinimumFuelQuantity minimumFuelQuantity = new MinimumFuelQuantity();

        minimumFuelQuantity.setSuccessor(shortRange);
        shortRange.setSuccessor(midRange);
        midRange.setSuccessor(longRange);
        longRange.setSuccessor(intercontinentalRange);

        FuelQuantityPlan fuelQuantityPlan = new FuelQuantityPlan("AB1", 2.0f);
        System.out.println(minimumFuelQuantity.calculateMaxFuelQuantity(fuelQuantityPlan));

        FuelQuantityPlan fuelQuantityPlan1 = new FuelQuantityPlan("AB2", 6.0f);
        System.out.println(minimumFuelQuantity.calculateMaxFuelQuantity(fuelQuantityPlan1));

        FuelQuantityPlan fuelQuantityPlan2 = new FuelQuantityPlan("AB3", 8.0f);
        System.out.println(minimumFuelQuantity.calculateMaxFuelQuantity(fuelQuantityPlan2));

        FuelQuantityPlan fuelQuantityPlan3 = new FuelQuantityPlan("AB4", 14.0f);
        System.out.println(minimumFuelQuantity.calculateMaxFuelQuantity(fuelQuantityPlan3));
    }
}
