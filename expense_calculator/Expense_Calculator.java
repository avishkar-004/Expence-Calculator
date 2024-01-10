package expense_calculator;

import javax.swing.*;

public class Expense_Calculator extends javax.swing.JFrame {

    public Expense_Calculator() {
        setTitle("Expense Calculator");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 500);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Expense_Calculator().setVisible(true);
            }
        });
    }
}
