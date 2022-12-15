package SimpleCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        app.setSize(700, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public double getNum1(){
        return Double.parseDouble(tfNumber1.getText());
    }

    public double getNum2(){
        return Double.parseDouble(tfNumber2.getText());
    }

    public SimpleCalcGUI(){
        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");
        cbOperations.setSelectedIndex(0);

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String op = (String) cbOperations.getSelectedItem();
                double result;

                switch (op){
                    case "+":
                        result = getNum1() + getNum2();
                        if(result % 1 == 0){
                            lblResult.setText(String.valueOf((int)result));
                            break;
                        }
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = getNum1() - getNum2();
                        if(result % 1 == 0){
                            lblResult.setText(String.valueOf((int)result));
                            break;
                        }
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "*":
                        result = getNum1() * getNum2();
                        if(result % 1 == 0){
                            lblResult.setText(String.valueOf((int)result));
                            break;
                        }
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "/":
                        result = getNum1() / getNum2();
                        if(result % 1 == 0){
                            lblResult.setText(String.valueOf((int)result));
                            break;
                        }
                        lblResult.setText(String.valueOf(result));
                        break;
                }
            }
        });
    }
}
