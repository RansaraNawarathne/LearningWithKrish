package Memento;

import java.util.ArrayList;

// Originator
public class Cart {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem (Item item) {
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return (ArrayList<Item>) items.clone();
    }

    public CartMemento save () {
        return new CartMemento(getItems());
    }

    public void revert (CartMemento cartMemento) {
        items = cartMemento.getItems();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }

    static class CartMemento {
        ArrayList<Item> items;

        public CartMemento(ArrayList<Item> items) {
            this.items = items;
        }

        private ArrayList<Item> getItems() {
            return items;
        }
    }
}
