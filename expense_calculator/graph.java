package expense_calculator;

import java.awt.Graphics;
import javax.swing.JPanel;

public class graph extends javax.swing.JFrame {

    private javax.swing.JPanel jPanel1;

    public graph() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graph().setVisible(true);
            }
        });
    }
}
