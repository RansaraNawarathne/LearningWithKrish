package FactoryMethodExample;

public class Application {
    public static void main(String[] args) {
        Runway r1 = RunwayFactory.selectRunway(RunwayFactory.RunwayCode.SIXL);
        System.out.println(r1);

        Runway r2 = RunwayFactory.selectRunway(RunwayFactory.RunwayCode.THIRTYTWOLEFT);
        System.out.println(r2);

        Runway r3 = RunwayFactory.selectRunway(RunwayFactory.RunwayCode.THIRTYFIVERIGHT);
        System.out.println(r3);

        Runway r4 = RunwayFactory.selectRunway(RunwayFactory.RunwayCode.FORTYFIVERIGHT);
        System.out.println(r4);
    }
}
