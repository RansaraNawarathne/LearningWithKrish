package MementoExample;

import java.util.Stack;

public class CareTaker {
    Stack<Software.SoftwareMemento> componentLog = new Stack<>();

    public void save (Software software) {
        componentLog.push(software.save());
    }

    public void revert (Software software) {
        if (componentLog.isEmpty()) {
            System.out.println("Cannot revert, you have reach to the end.....");
        } else {
            software.revert(componentLog.pop());
        }
    }
}
