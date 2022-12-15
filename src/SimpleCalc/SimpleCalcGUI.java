package SimpleCalc;

import javax.swing.*;
import java.awt.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel MainPanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;

    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.MainPanel);
        app.setSize(800, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.cbOperations.addItem("+");
        app.cbOperations.addItem("-");
        app.cbOperations.addItem("*");
        app.cbOperations.addItem("/");
    }
}
