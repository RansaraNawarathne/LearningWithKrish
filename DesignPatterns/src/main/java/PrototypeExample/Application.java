package PrototypeExample;

public class Application {
    public static void main(String[] args) {
        Registry registry = new Registry();

        EconomyClass economyClass = (EconomyClass) registry.getTicket(AirlineTicketType.ECONOMY);
        System.out.println("Initial Values........");
        System.out.println("Economy Class: " + economyClass);

        economyClass.setFlightNumber("CX400");
        economyClass.setDuration(0.0);
        economyClass.setDeparture("CMB");
        economyClass.setArrival("HKG");
        economyClass.setSeatNumber("CE14");
        economyClass.setNeedAssistant(true);
        System.out.println("After Setting New Values........");
        System.out.println("Economy Class: " + economyClass);

        EconomyClass economyClass1 = (EconomyClass) registry.getTicket(AirlineTicketType.ECONOMY);
        System.out.println("New Economy Class Instance Values........");
        System.out.println("Economy Class: " + economyClass1);

    }
}
