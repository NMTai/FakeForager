package Inventory;

import Items.Item;

import javax.swing.*;

public class Slot {
    private boolean empty = true;
    private ImageIcon icon;
    public Slot () {

    }
    public Slot (Item item) {

    }
    public Slot (String icon) {
        this.icon = new ImageIcon(new ImageIcon(icon).getImage().getScaledInstance(50,50, 1));
    }

    /**
     * Gibt zurück ob der Slot Leer ist
     * @return empty
     */
    public boolean isEmpty() {
        return empty;
    }

    public ImageIcon getIcon () {
        return icon;
    }
}
