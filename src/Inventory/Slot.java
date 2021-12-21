package Inventory;

import javax.swing.*;

public class Slot {
    private boolean empty = true;
    private ImageIcon icon;
    public Slot () {

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
