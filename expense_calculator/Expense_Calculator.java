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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setText("Expense Calculator");
        
        jLabel5.setText("Expense");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel7.setText("Income");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        jLabel9.setText("Total");
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pack();
    }

    private void insertintable() {
        // populate table from database
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
// Action button handlers will be added here
