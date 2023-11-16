package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton computeResultButton;
    private JPanel panel;
    private JTextField tfResult;


    public SimpleCalculator() {
        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");

        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String op = null;
                double n1,n2;
                try {
                    n1 = Double.parseDouble(tfNumber1.getText());
                    op = (String) cbOperations.getSelectedItem();
                    n2 = Double.parseDouble(tfNumber2.getText());
                    switch (op) {
                        case "+":
                            tfResult.setText(String.valueOf(n1+n2));
                            break;
                        case "-":
                            tfResult.setText(String.valueOf(n1-n2));
                            break;

                        case "*":
                            tfResult.setText(String.valueOf(n1*n2));
                            break;

                        case "/":
                            double quo = n1/n2;
                            tfResult.setText(String.valueOf(quo));
                            break;
                    }
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "Input must be a number");
                }

            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setContentPane(calc.panel);
        calc.setSize(1000,500);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setTitle("Simple Calculator");
        calc.setVisible(true);

    }
}


