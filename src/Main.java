

import javax.swing.*;
import java.awt.*;





public class Main extends JFrame{
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
           MainFrame mainFrame = new MainFrame();
           mainFrame.setVisible(true);
        });

    }
}