package PrototypeExample;

public class EconomyClass extends AirlineTicket{
    private boolean needAssistant;

    public boolean isNeedAssistant() {
        return needAssistant;
    }

    public void setNeedAssistant(boolean needAssistant) {
        this.needAssistant = needAssistant;
    }

    @Override
    public String toString() {
        return "EconomyClass{" +
                "flightNumber='" + super.getFlightNumber() + '\'' +
                ", duration=" + super.getDuration() +
                ", departure='" + super.getDeparture() + '\'' +
                ", arrival='" + super.getArrival() + '\'' +
                ", seatNumber='" + super.getSeatNumber() + '\'' +
                "needAssistant=" + needAssistant +
                '}';
    }
}
