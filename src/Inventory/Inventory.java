package Inventory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Inventar
 * Slots des Inventars
 */
public class Inventory extends JFrame {
    public Inventory () {
        this.setSize(500, 400);
        this.setUndecorated(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.pink);
        for (int i = 1; i<38 ; i++) {

        }
        addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                if ((e.getX()>getX() || e.getX()< getX()+450) && (e.getY()<getY()+50)) {
                    setLocation(e.getXOnScreen()-200, e.getYOnScreen()-20);
                }
            }
            public void mouseMoved(MouseEvent e) {}
        });
    }

    public void drawInv(Graphics g) {
        g.drawLine(0, 50, 500, 50);
    }

    public void openInventory () {
        this.setVisible(true);
    }

    public void closeInventory () {
        this.setVisible(false);
    }

    private Slot hotbar1 = new Slot();
    private Slot hotbar2 = new Slot();
    private Slot hotbar3 = new Slot();
    private Slot hotbar4 = new Slot();
    private Slot hotbar5 = new Slot();
    private Slot hotbar6 = new Slot();
    private Slot hotbar7 = new Slot();
    private Slot hotbar8 = new Slot();
    private Slot hotbar9 = new Slot();

    private Slot Row1Col1 = new Slot();
    private Slot Row1Col2 = new Slot();
    private Slot Row1Col3 = new Slot();
    private Slot Row1Col4 = new Slot();
    private Slot Row1Col5 = new Slot();
    private Slot Row1Col6 = new Slot();
    private Slot Row1Col7 = new Slot();
    private Slot Row1Col8 = new Slot();
    private Slot Row1Col9 = new Slot();

    private Slot Row2Col1 = new Slot();
    private Slot Row2Col2 = new Slot();
    private Slot Row2Col3 = new Slot();
    private Slot Row2Col4 = new Slot();
    private Slot Row2Col5 = new Slot();
    private Slot Row2Col6 = new Slot();
    private Slot Row2Col7 = new Slot();
    private Slot Row2Col8 = new Slot();
    private Slot Row2Col9 = new Slot();

    private Slot Row3Col1 = new Slot();
    private Slot Row3Col2 = new Slot();
    private Slot Row3Col3 = new Slot();
    private Slot Row3Col4 = new Slot();
    private Slot Row3Col5 = new Slot();
    private Slot Row3Col6 = new Slot();
    private Slot Row3Col7 = new Slot();
    private Slot Row3Col8 = new Slot();
    private Slot Row3Col9 = new Slot();

    public Slot getSlot(int Row, int Column) {
        switch (Row) {
            case 1:
                switch (Column) {
                    case 1:
                        return Row1Col1;
                    case 2:
                        return Row1Col2;
                    case 3:
                        return Row1Col3;
                    case 4:
                        return Row1Col4;
                    case 5:
                        return Row1Col5;
                    case 6:
                        return Row1Col6;
                    case 7:
                        return Row1Col7;
                    case 8:
                        return Row1Col8;
                    case 9:
                        return Row1Col9;
                }
            case 2:
                switch (Column) {
                    case 1:
                        return Row2Col1;
                    case 2:
                        return Row2Col2;
                    case 3:
                        return Row2Col3;
                    case 4:
                        return Row2Col4;
                    case 5:
                        return Row2Col5;
                    case 6:
                        return Row2Col6;
                    case 7:
                        return Row2Col7;
                    case 8:
                        return Row2Col8;
                    case 9:
                        return Row2Col9;
                }
            case 3:
                switch (Column) {
                    case 1:
                        return Row3Col1;
                    case 2:
                        return Row3Col2;
                    case 3:
                        return Row3Col3;
                    case 4:
                        return Row3Col4;
                    case 5:
                        return Row3Col5;
                    case 6:
                        return Row3Col6;
                    case 7:
                        return Row3Col7;
                    case 8:
                        return Row3Col8;
                    case 9:
                        return Row3Col9;
                }
            case 4:
                switch (Column) {
                    case 1:
                        return hotbar1;
                    case 2:
                        return hotbar2;
                    case 3:
                        return hotbar3;
                    case 4:
                        return hotbar4;
                    case 5:
                        return hotbar5;
                    case 6:
                        return hotbar6;
                    case 7:
                        return hotbar7;
                    case 8:
                        return hotbar8;
                    case 9:
                        return hotbar9;
                }
        }
        return(null);
    }
}
