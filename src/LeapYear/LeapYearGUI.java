package LeapYear;

import javax.swing.*;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.mainPanel);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }

    public int getYear() {
        return Integer.parseInt(tfYear.getText());
    }

    public boolean isLeapYear() {
        if (getYear() % 4 == 0) {
            return true;
        } else if (getYear() % 4 == 0 && getYear() % 100 == 0 && getYear() % 400 == 0) {
            return true;
        }
        return false;
    }

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(Integer.parseInt(tfYear.getText()) <= 0){
                        throw new Exception();
                    }

                    if (!isLeapYear()) {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    } else if(isLeapYear()) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    }
                } catch (Exception r){
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                    tfYear.setText("");
                }
            }
        });
    }
}
