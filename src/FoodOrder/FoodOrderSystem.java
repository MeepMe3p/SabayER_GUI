package FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderSystem extends JFrame{
    private JPanel panel1;
    private JCheckBox cSundae;
    private JCheckBox cBurger;
    private JCheckBox cPizza;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodOrderSystem() {

        btnOrder.addActionListener(new ActionListener() {



            @Override
            public void actionPerformed(ActionEvent e) {
                double total_items = 0;
                double total=0;

                if(cPizza.isSelected()){
                    total_items += 100;
                }
                if(cBurger.isSelected()){
                    total_items += 80;
                }
                if(cFries.isSelected()){
                    total_items += 65;
                }
                if(cSoftDrinks.isSelected()){
                    total_items += 55;
                }
                if(cTea.isSelected()){
                    total_items += 50;
                }
                if(cSundae.isSelected()){
                    total_items += 40;
                }
                if(rbNone.isSelected()){
                    total = total_items - total;
                    total = total_items;
                    JOptionPane.showMessageDialog(null,"The total price is Php "+total);
                }
                if(rb5.isSelected()){
                    total = total_items * .05;
                    total = total_items - total;

                    JOptionPane.showMessageDialog(null,"The total price is Php "+total);
                }
                if(rb10.isSelected()){
                    total = total_items *.10;
                    total = total_items - total;
                    JOptionPane.showMessageDialog(null,"The total price is Php "+total);
                }
                if(rb15.isSelected()){
                    total = total_items * .15;
                    total = total_items - total;
                    JOptionPane.showMessageDialog(null,"The total price is Php "+total);
                }
            }

        });
    }

    public static void main(String[] args) {
        FoodOrderSystem lp = new FoodOrderSystem();
        lp.setContentPane(lp.panel1);
        lp.setSize(500,500);
        lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lp.setTitle("Food Ordering System");
        lp.setVisible(true);
    }


}
