package BuilderExample;

public class Application {
    public static void main(String[] args) {
        FlightPlanTelescopic1 flp1 = new FlightPlanTelescopic1("AB1", 1000.15f);
        System.out.println(flp1);

        FlightPlanTelescopic2 flp2 = new FlightPlanTelescopic2("AB1", 1000.15f, null, true, null);
        System.out.println(flp2);

        FlightPlan.Builder builder = new FlightPlan.Builder("AB1");
        FlightPlan flp = builder.distance(1000.15f).specialTransport(true).totalWeight(5000).Build();
        System.out.println(flp);
    }
}
