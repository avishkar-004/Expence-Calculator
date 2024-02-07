/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package expense_calculator;

import java.sql.ResultSet;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Avishkar
 */
public class Expense_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Expense_Calculator
     */
    public Expense_Calculator() {
        System.out.println("callong constroctor expense_calculator.Expense_Calculator.<init>()");
        initComponents();
        insertintable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jFrame2 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jFrame1.setMinimumSize(new java.awt.Dimension(450, 400));
        jFrame1.setSize(getPreferredSize());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel2.setText("Add Transaction");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel3.setText("Type : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setText("Description :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel11.setText("Amount :");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expense", "Income" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel12.setText("Category :");

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 18));

        jFrame2.setMinimumSize(new java.awt.Dimension(500, 500));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jLabel13.setText("Are You Sure You Want to Delete");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel14.setText("Type :");
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel16.setText("Category :");
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel18.setText("Description :");
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel20.setText("Amount :");

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 5, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setText("Expense Calculator");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Expense");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Income");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton3.setText("Add transaction");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton4.setText("Remove transaction");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton6.setText("Analytics");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jFrame1.setVisible(true);
        String str[] = {"Housing", "Transportation", "Groceries", "Shopping", "Healthcare", "Education", "Entertainment", "Dining Out", "Travel", "Investments", "Donations", "Gifts", "Insurance", "Others"};
        for (String item : str) {
            jComboBox2.addItem(item);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String type = jComboBox1.getSelectedItem().toString();
        String description = jTextField1.getText();
        String amount = jTextField2.getText();
        String category = jComboBox2.getSelectedItem().toString();
        db.insertExpense(type, description, amount, category);
        jFrame1.setVisible(false);
        insertintable();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (model.getValueAt(jTable1.getSelectedRow(), 2).toString() != null) {
            jFrame2.setVisible(true);
        }
        jLabel15.setText(model.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jLabel17.setText(model.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jTextField3.setText(model.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jLabel21.setText(model.getValueAt(jTable1.getSelectedRow(), 5).toString());
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jComboBox1.getSelectedItem() == "Income") {
            String Source[] = {"Salary/Allowances", "Business", "Rental Income", "Investment Returns", "Part-Time Jobs", "Pension", "Scholarship", "Gift", "Lottery", "Selling Assets"};
            jComboBox2.removeAllItems();
            for (String item : Source) { jComboBox2.addItem(item); }
        } else {
            String Source[] = {"Housing", "Transportation", "Groceries", "Shopping", "Healthcare", "Education", "Entertainment", "Dining Out", "Travel", "Investments", "Donations", "Gifts", "Insurance", "Others"};
            jComboBox2.removeAllItems();
            for (String item : Source) { jComboBox2.addItem(item); }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int id = Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
        db.deleteExpense(id);
        insertintable();
        jFrame2.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jFrame2.setVisible(false);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        graph.main(null);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Expense_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expense_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expense_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expense_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println(".run()");
                new Expense_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;
    private javax.swing.JComboBox<String> jComboBox1, jComboBox2;
    private javax.swing.JFrame jFrame1, jFrame2;
    private javax.swing.JLabel jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15;
    private javax.swing.JLabel jLabel16, jLabel17, jLabel18, jLabel2, jLabel20, jLabel21;
    private javax.swing.JLabel jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9;
    private javax.swing.JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel6, jPanel7, jPanel8, jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1, jTextField2, jTextField3;
}
// Full UI layout managed by NetBeans form editor
// Add transaction button handler opens dialog frame
// Delete confirmation shows selected transaction details
