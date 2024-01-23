package expense_calculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 * @author Avishkar
 */
public class pie extends javax.swing.JFrame {

    public pie() {
        initComponents();
    }

    private void initComponents() {
        setPreferredSize(new java.awt.Dimension(800, 600));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(pie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pie().setVisible(true);
            }
        });
    }

    static class PieChartPanel extends JPanel {
        private final Map<String, Double> data;
        private final String title;

        public PieChartPanel(Map<String, Double> data, String title) {
            this.data = data;
            this.title = title;
        }
    }
}
