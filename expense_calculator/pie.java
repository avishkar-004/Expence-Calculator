package expense_calculator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 * @author Avishkar
 */
public class pie extends javax.swing.JFrame {

    public pie() {
        initComponents();
        add(new PieChartPanel(fetchIncomeExpenseData(), "Income vs Expense"));
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

    private Map<String, Double> fetchIncomeExpenseData() {
        Map<String, Double> data = new HashMap<>();
        try {
            ResultSet rs = db.fetchIncomeExpenseData();
            while (rs.next()) {
                data.put(rs.getString("Type"), rs.getDouble("Total"));
            }
        } catch (Exception e) {
            data = null;
        }
        return data;
    }

    private Map<String, Double> fetchCategoryData(String type) {
        Map<String, Double> data = new HashMap<>();
        try {
            ResultSet rs = db.fetchCategoryData(type);
            while (rs.next()) {
                data.put(rs.getString("Category"), rs.getDouble("Total"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
            this.paintComponent();
        }

        protected void paintComponent() {
            System.out.println("pie func call");
            Graphics g = null;
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            g2d.setColor(Color.BLACK);
            g2d.drawString(title, width / 2 - title.length() * 3, 20);

            double total = data.values().stream().mapToDouble(Double::doubleValue).sum();

            int x = 50, y = 50, diameter = Math.min(width, height) - 100;
            int startAngle = 0;
            int i = 0;
            Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.CYAN, Color.MAGENTA, Color.PINK, Color.GRAY, Color.LIGHT_GRAY};

            for (Map.Entry<String, Double> entry : data.entrySet()) {
                String label = entry.getKey();
                double value = entry.getValue();
                int angle = (int) Math.round((value / total) * 360);

                g2d.setColor(colors[i % colors.length]);
                g2d.fillArc(x, y, diameter, diameter, startAngle, angle);

                g2d.fillRect(20, 50 + i * 20, 10, 10);
                g2d.setColor(Color.BLACK);
                g2d.drawString(label + " (" + String.format("%.1f", (value / total) * 100) + "%)", 40, 60 + i * 20);

                startAngle += angle;
                i++;
            }
        }
    }
}
