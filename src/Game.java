import javax.swing.*;
public class Game extends JPanel implements Runnable{
    Thread gamethread = new Thread(this);
    public Game() {
        JFrame frame = new JFrame();
        getToolkit().getScreenSize();
        frame.setSize(1530, 820);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
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
}
