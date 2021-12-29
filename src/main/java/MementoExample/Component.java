package MementoExample;

//Memento
public class Component {
    private String componentName;

    public Component(String componentName) {
        this.componentName = componentName;
    }

    @Override
    public String toString() {
        return "Component{" +
                "componentName='" + componentName + '\'' +
                '}';
    }
}
