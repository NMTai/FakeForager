package Inventory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Inventar
 * Slots des Inventars
 */
public class Inventory extends JFrame {
    public Inventory () {
        this.setLayout(null);
        this.setSize(500, 400);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.decode("#5b3a29"));
        repaint();
        addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                if ((e.getX()>getX() || e.getX()< getX()+450) && (e.getYOnScreen()<getY()+50)) {
                    setLocation(e.getXOnScreen()-200, e.getYOnScreen()-20);
                }
            }
            public void mouseMoved(MouseEvent e) {}
        });
        addtoArray();
        drawlabels();
    }

    private ArrayList<JButton> buttons = new ArrayList<>();
    JButton akt;
    private void drawlabels () {
        int startx = 20;
        int starty = 60;
        for (int i = 1; i < 37; i++) {
            JButton label = new JButton(getSlot(i).getIcon());
            buttons.add(label);
            label.setSize(50, 50);
            label.setLocation(startx, starty);
            label.setBackground(null);
            label.setText(i+"");
            label.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    for (JButton button : buttons) {
                        button.setBackground(null);
                    }
                    akt = label;
                    label.setBackground(Color.red);
                    requestFocus();

                }
            });
            add(label);
            startx+=50;
            if (startx > 450) {
                startx = 20;
                starty += 50;
            }
            if (starty >= 210) {
                starty = 300;
            }
        }
    }

    public void openInventory () {
        this.setVisible(true);
    }

    public void closeInventory () {
        this.setVisible(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int startx = 20;
        int starty = 60;
        g.fillRect(0, 0, 500, 40);
        for (int i = 1; i < 37; i++) {
            g.drawRect(startx, starty, 50, 50);
            startx+=50;
            if (startx > 450) {
                startx = 20;
                starty += 50;
            }
            if (starty >= 210) {
                starty = 300;
            }
        }
    }

    ArrayList<Slot> slots = new ArrayList<>();
    private Slot hotbar1 = new Slot("src/schwert2.png");
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

    private void addtoArray() {
        slots.add(Row1Col1);
        slots.add(Row1Col2);
        slots.add(Row1Col3);
        slots.add(Row1Col4);
        slots.add(Row1Col5);
        slots.add(Row1Col6);
        slots.add(Row1Col7);
        slots.add(Row1Col8);
        slots.add(Row1Col9);
        slots.add(Row2Col1);
        slots.add(Row2Col2);
        slots.add(Row2Col3);
        slots.add(Row2Col4);
        slots.add(Row2Col5);
        slots.add(Row2Col6);
        slots.add(Row2Col7);
        slots.add(Row2Col8);
        slots.add(Row2Col9);
        slots.add(Row3Col1);
        slots.add(Row3Col2);
        slots.add(Row3Col3);
        slots.add(Row3Col4);
        slots.add(Row3Col5);
        slots.add(Row3Col6);
        slots.add(Row3Col7);
        slots.add(Row3Col8);
        slots.add(Row3Col9);
        slots.add(hotbar1);
        slots.add(hotbar2);
        slots.add(hotbar3);
        slots.add(hotbar4);
        slots.add(hotbar5);
        slots.add(hotbar6);
        slots.add(hotbar7);
        slots.add(hotbar8);
        slots.add(hotbar9);


    }

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
    public Slot getSlot(int slot) {
        switch (slot) {
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
            case 10:
                return Row2Col1;
            case 11:
                return Row2Col2;
            case 12:
                return Row2Col3;
            case 13:
                return Row2Col4;
            case 14:
                return Row2Col5;
            case 15:
                return Row2Col6;
            case 16:
                return Row2Col7;
            case 17:
                return Row2Col8;
            case 18:
                return Row2Col9;
            case 19:
                return Row3Col1;
            case 20:
                return Row3Col2;
            case 21:
                return Row3Col3;
            case 22:
                return Row3Col4;
            case 23:
                return Row3Col5;
            case 24:
                return Row3Col6;
            case 25:
                return Row3Col7;
            case 26:
                return Row3Col8;
            case 27:
                return Row3Col9;
            case 28:
                return hotbar1;
            case 29:
                return hotbar2;
            case 30:
                return hotbar3;
            case 31:
                return hotbar4;
            case 32:
                return hotbar5;
            case 33:
                return hotbar6;
            case 34:
                return hotbar7;
            case 35:
                return hotbar8;
            case 36:
                return hotbar9;
        }
        return null;
    }
}
