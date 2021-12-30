package PrototypeExample;

public class BusinessClass extends AirlineTicket{
    private boolean needOnBoardDrink;
    private boolean loungeAccess;
    private boolean VIPTransport;

    public boolean isNeedOnBoardDrink() {
        return needOnBoardDrink;
    }

    public void setNeedOnBoardDrink(boolean needOnBoardDrink) {
        this.needOnBoardDrink = needOnBoardDrink;
    }

    public boolean isLoungeAccess() {
        return loungeAccess;
    }

    public void setLoungeAccess(boolean loungeAccess) {
        this.loungeAccess = loungeAccess;
    }

    public boolean isVIPTransport() {
        return VIPTransport;
    }

    public void setVIPTransport(boolean VIPTransport) {
        this.VIPTransport = VIPTransport;
    }

    @Override
    public String toString() {
        return "BusinessClass{" +
                "flightNumber='" + super.getFlightNumber() + '\'' +
                ", duration=" + super.getDuration() +
                ", departure='" + super.getDeparture() + '\'' +
                ", arrival='" + super.getArrival() + '\'' +
                ", seatNumber='" + super.getSeatNumber() + '\'' +
                ", needOnBoardDrink=" + needOnBoardDrink +
                ", loungeAccess=" + loungeAccess +
                ", VIPTransport=" + VIPTransport +
                '}';
    }
}
