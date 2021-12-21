package Player;

import javax.swing.*;
import java.awt.*;

/**
 * @author Mario Magdziarek
 * @version 1.0
 *
 * Klasse des Spielers mit den Attributen
 * lives -> Leben des Spielers
 * experience -> Erfahrungspunkte des Spielers
 * level -> Level des Spielers
 * designation -> Levelname des Spielers
 */
public class Player extends Rectangle {
    private double lives = 20.0;
    private double experience;
    private int level = 1;
    private Designation designation = Designation.Beginner;

    private Image picture;
    public Player () {

    }

    /**
     * @param g : Graphics from MainPanel
     * @param observer : MainPanel
     * draws the Player in the MainPanel
     */
    public void drawFigure (Graphics g, JPanel observer) {
        g.drawImage(picture, this.x, this.y, observer);
    }


    /**
     * @return designation from the Player
     */
    public Designation getDesignation () {
        return designation;
    }

    /**
     * @return experience from the Player
     */
    public double getExperience () {
        return experience;
    }
    public double getLives() {
        return lives;
    }

    /**
     * @return Level from the Player
     */
    public int getLevel() {
        return level;
    }
}