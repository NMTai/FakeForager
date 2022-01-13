import Inventory.Inventory;
import Player.Player;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable {
    Player player = new Player();
    Thread gamethread = new Thread(this);
    public Game() {
        JFrame frame = new JFrame();
        getToolkit().getScreenSize();
        frame.setSize(1530, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        player.getInventory().openInventory();
        //frame.setIconImage();
    }

    public void run() {
        while (true) {
            System.out.println("");
            try {
                repaint();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paintComponent (Graphics g) {
        player.drawFigure(g, this);
        player.getInventory().repaint();
    }
}
