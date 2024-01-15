package expense_calculator;

import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * @author Avishkar
 */
public class Expense_Calculator extends javax.swing.JFrame {

    private javax.swing.JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;
    private javax.swing.JComboBox<String> jComboBox1, jComboBox2;
    private javax.swing.JFrame jFrame1, jFrame2;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
    private javax.swing.JLabel jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12;
    private javax.swing.JLabel jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18;
    private javax.swing.JLabel jLabel20, jLabel21;
    private javax.swing.JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel6, jPanel7, jPanel8, jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1, jTextField2, jTextField3;

    public Expense_Calculator() {
        System.out.println("callong constroctor expense_calculator.Expense_Calculator.<init>()");
        initComponents();
        insertintable();
    }

    private void initComponents() {
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jTable1.setRowHeight(30);
        jTable1.setRowMargin(5);
        jTable1.setShowGrid(true);
        jScrollPane2.setViewportView(jTable1);
        pack();
    }

    private void insertintable() {
        try {
            ResultSet rs = db.getIncomeExpenseData();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{"Id", "Date", "Type", "Description", "category", "Amount"}
            ) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            });

            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(100);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(5), rs.getString(2), rs.getString(3), rs.getString(6), "\u20B9" + rs.getInt(4)});
            }

            int expenses = db.getTotalExpenses();
            jLabel6.setText("\u20B9" + expenses);
            int income = db.getTotalIncome();
            jLabel8.setText("\u20B9" + income);
            jLabel10.setText("\u20B9" + (income - expenses));
        } catch (Exception e) {
            System.out.println(e);
        }
        ColourRows();
    }

    void ColourRows() {
        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if ("Expense".equals(table.getValueAt(row, 2))) {
                    c.setBackground(new Color(255, 150, 150));
                } else {
                    c.setBackground(new Color(170, 255, 0));
                }
                if (isSelected) {
                    c.setBackground(table.getSelectionBackground());
                    c.setForeground(table.getSelectionForeground());
                } else {
                    c.setForeground(Color.BLACK);
                }
                return c;
            }
        });
    }

    public static void main(String args[]) {
        System.out.println("expense_calculator.Expense_Calculator.main()");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Expense_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println(".run()");
                new Expense_Calculator().setVisible(true);
            }
        });
    }
}
