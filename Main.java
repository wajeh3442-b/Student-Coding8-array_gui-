import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new gui().setVisible(true));
        SwingUtilities.invokeLater(ani::new);
    }
}