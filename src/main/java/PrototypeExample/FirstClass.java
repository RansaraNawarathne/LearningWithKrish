package PrototypeExample;

public class FirstClass extends AirlineTicket{
    private boolean needOnBoardDrink;
    private boolean loungeAccess;

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

    @Override
    public String toString() {
        return "FirstClass{" +
                "flightNumber='" + super.getFlightNumber() + '\'' +
                ", duration=" + super.getDuration() +
                ", departure='" + super.getDeparture() + '\'' +
                ", arrival='" + super.getArrival() + '\'' +
                ", seatNumber='" + super.getSeatNumber() + '\'' +
                ", needOnBoardDrink=" + needOnBoardDrink +
                ", loungeAccess=" + loungeAccess +
                '}';
    }
}
