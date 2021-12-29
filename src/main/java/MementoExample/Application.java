package MementoExample;

public class Application {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Software software = new Software();

        software.addComponent(new Component("Frontend Validation"));
        careTaker.save(software);
        System.out.println(software);

        software.addComponent(new Component("WebSocket"));
        software.addComponent(new Component("Authenticator"));
        careTaker.save(software);
        System.out.println(software);

        software.addComponent(new Component("Backend Validation"));
        software.addComponent(new Component("Business Function"));
        software.addComponent(new Component("Database Connection"));
        careTaker.save(software);
        System.out.println(software);

        careTaker.revert(software);
        System.out.println(software);

        careTaker.revert(software);
        System.out.println(software);

        careTaker.revert(software);
        System.out.println(software);

        careTaker.revert(software);
        System.out.println(software);
    }
}
