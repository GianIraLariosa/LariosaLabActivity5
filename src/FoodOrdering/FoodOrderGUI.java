package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel MainPanel;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.MainPanel);
        app.setSize(400, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }

    public FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = 0;
                double discount = 0;
                if(cPizza.isSelected()){
                    amount += 100;
                }

                if(cBurger.isSelected()){
                    amount += 80;
                }

                if(cFries.isSelected()){
                    amount += 65;
                }

                if(cSoftDrinks.isSelected()){
                    amount += 55;
                }

                if(cTea.isSelected()){
                    amount += 50;
                }

                if(cSundae.isSelected()){
                    amount += 40;
                }

                if(rb5.isSelected()){
                    discount = (double) amount * 0.05;
                    amount -= discount;
                    JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", amount));
                }

                if(rb10.isSelected()){
                    discount = (double) amount * 0.10;
                    amount -= discount;
                    JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", amount));
                }

                if(rb15.isSelected()){
                    discount = (double) amount * 0.15;
                    amount -= discount;
                    JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", amount));
                }

                if(rbNone.isSelected()){
                    JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", amount));
                }
            }
        });
    }
}
