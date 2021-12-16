package FactoryMethodExample;

public class RunwayFactory {
    enum RunwayCode {
        SIXL,
        THIRTYTWOLEFT,
        THIRTYFIVERIGHT,
        FORTYFIVERIGHT
    }

    public static Runway selectRunway (RunwayCode runwayCode) {
        switch (runwayCode ) {
            case SIXL:
                return new Runway6L();
            case THIRTYTWOLEFT:
                return new Runway32L();
            case THIRTYFIVERIGHT:
                return new Runway35R();
            case FORTYFIVERIGHT:
                return new Runway45R();
            default:
                return null;
        }
    }
}
