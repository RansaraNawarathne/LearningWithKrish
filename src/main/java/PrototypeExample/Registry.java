package PrototypeExample;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<AirlineTicketType, AirlineTicket> tickets = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    public AirlineTicket getTicket (AirlineTicketType airlineTicketType) {
        AirlineTicket airlineTicket = null;
        try {
            airlineTicket = (AirlineTicket) tickets.get(airlineTicketType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return airlineTicket;
    }

    private void initialize() {
        EconomyClass economyClass = new EconomyClass();
        economyClass.setFlightNumber("AB1");
        economyClass.setDuration(4.5);
        economyClass.setDeparture("CMB");
        economyClass.setArrival("KUL");
        economyClass.setSeatNumber("AA12");

        BusinessClass businessClass = new BusinessClass();
        businessClass.setFlightNumber("AB1");
        businessClass.setDuration(4.5);
        businessClass.setDeparture("CMB");
        businessClass.setArrival("KUL");
        businessClass.setSeatNumber("BB21");
        businessClass.setNeedOnBoardDrink(true);
        businessClass.setLoungeAccess(true);
        businessClass.setVIPTransport(true);

        FirstClass firstClass = new FirstClass();
        firstClass.setFlightNumber("AB1");
        firstClass.setDuration(4.5);
        firstClass.setDeparture("CMB");
        firstClass.setArrival("KUL");
        firstClass.setSeatNumber("CC34");
        firstClass.setNeedOnBoardDrink(true);
        firstClass.setLoungeAccess(true);

        tickets.put(AirlineTicketType.ECONOMY, economyClass);
        tickets.put(AirlineTicketType.BUSINESS, businessClass);
        tickets.put(AirlineTicketType.FIRST, firstClass);
    }
}
