package MementoExample;

import java.util.ArrayList;

//Originator
public class Software {
    ArrayList <Component> components = new ArrayList<>();

    public void addComponent (Component component) {
        components.add(component);
    }

    public ArrayList<Component> getComponents() {
        return (ArrayList<Component>) components.clone();
    }

    public SoftwareMemento save () {
        return  new SoftwareMemento(getComponents());
    }

    public void revert (SoftwareMemento softwareMemento) {
        components = softwareMemento.getComponents();
    }

    @Override
    public String toString() {
        return "Software{" +
                "components=" + components +
                '}';
    }

    protected static class SoftwareMemento {
        ArrayList<Component> components;

        public SoftwareMemento(ArrayList<Component> components) {
            this.components = components;
        }

        private ArrayList<Component> getComponents() {
            return components;
        }
    }
}
