package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear  extends JFrame {
    private JTextField tfYear;
    private JPanel panel1;
    private JTextField tfInput;
    private JButton btnCheckYear;
    private JPanel panel;

    private int year;
    public LeapYear(){


        tfYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    year = Integer.parseInt(tfYear.getText());

                }catch(Exception a){
                    JOptionPane.showMessageDialog(null,"Input must be an integer");
                }
                if(year % 400 == 0){
                    JOptionPane.showMessageDialog(null,"Leap Year");
                }else if(year % 100 == 0){
                    JOptionPane.showMessageDialog(null,"Not a Leap year");
                }else if(year % 4 == 0){
                    JOptionPane.showMessageDialog(null,"Leap year");
                }else{
                    JOptionPane.showMessageDialog(null,"Not a leap year");

                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYear lp = new LeapYear();
        lp.setContentPane(lp.panel1);
        lp.setSize(500,500);
        lp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lp.setTitle("Leap Year Checker");
        lp.setVisible(true);
    }
}
