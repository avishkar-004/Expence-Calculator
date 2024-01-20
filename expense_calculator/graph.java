package expense_calculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.sql.*;

/**
 * @author Avishkar
 */
public class graph extends javax.swing.JFrame {

    private javax.swing.JPanel jPanel1;

    public graph() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBarGraph(g);
            }
        };

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    private void drawBarGraph(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        String[] categories = new String[6];
        int[][] values = new int[6][2];

        try {
            ResultSet rs = db.getAnalyticData();
            int i = 0;
            while (rs.next()) {
                categories[i] = rs.getString("Month");
                values[i][0] = rs.getInt("Income");
                values[i][1] = rs.getInt("Expense");
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        int panelWidth = jPanel1.getWidth();
        int panelHeight = jPanel1.getHeight();
        int margin = 50;
        int barWidth = 20;
        int spacing = 20;
        int groupWidth = 2 * barWidth + spacing;
        int maxBarHeight = panelHeight - 2 * margin;

        int maxValue = 0;
        for (int[] pair : values) {
            for (int value : pair) {
                maxValue = Math.max(maxValue, value);
            }
        }

        g2d.drawLine(margin, panelHeight - margin, panelWidth - margin, panelHeight - margin);
        g2d.drawLine(margin, margin, margin, panelHeight - margin);

        for (int i = 0; i < categories.length; i++) {
            int xBase = margin + i * (groupWidth + spacing);
            int yBase = panelHeight - margin;

            int bar1Height = (values[i][0] * maxBarHeight) / maxValue;
            g2d.setColor(Color.BLUE);
            g2d.fillRect(xBase, yBase - bar1Height, barWidth, bar1Height);

            int bar2Height = (values[i][1] * maxBarHeight) / maxValue;
            g2d.setColor(Color.RED);
            g2d.fillRect(xBase + barWidth + spacing / 2, yBase - bar2Height, barWidth, bar2Height);

            g2d.setColor(Color.BLACK);
            g2d.drawString(categories[i], xBase + barWidth / 2, yBase + 15);
        }

        int ySteps = 5;
        for (int i = 0; i <= ySteps; i++) {
            int yLabel = (maxValue * i) / ySteps;
            int yPosition = panelHeight - margin - (maxBarHeight * i) / ySteps;
            g2d.setColor(Color.LIGHT_GRAY);
            g2d.drawLine(margin, yPosition, panelWidth - margin, yPosition);
            g2d.setColor(Color.BLACK);
            g2d.drawString(String.valueOf(yLabel), margin - 30, yPosition);
        }

        g2d.setColor(Color.BLUE);
        g2d.drawString("Income (Blue)", panelWidth - 100, margin + 20);
        g2d.setColor(Color.RED);
        g2d.drawString("Expense (Red)", panelWidth - 100, margin + 40);
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
            java.util.logging.Logger.getLogger(graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graph().setVisible(true);
            }
        });
    }
}
