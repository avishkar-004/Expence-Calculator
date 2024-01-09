package expense_calculator;

import java.sql.*;

public class db {

    private static final String URL = "jdbc:mysql://localhost:3306/expensecalculator";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static ResultSet getIncomeExpenseData() {
        String query = "SELECT * FROM expenses ORDER BY date DESC, id DESC";
        Connection con = null;
        Statement stmt = null;
        try {
            con = getConnection();
            stmt = con.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error fetching data: " + e.getMessage());
        }
        return null;
    }

    public static void insertExpense(String type, String description, String amount, String category) {
        String query = "INSERT INTO expenses (Type, Description, Amount, date, Category) "
                + "VALUES (?, ?, ?, (SELECT CURRENT_DATE()), ?)";
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, type);
            pstmt.setString(2, description);
            pstmt.setString(3, amount);
            pstmt.setString(4, category);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }

    public static int getTotalExpenses() {
        String query = "SELECT SUM(Amount) FROM expenses WHERE type = 'Expense'";
        try (Connection con = getConnection(); Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error fetching total expenses: " + e.getMessage());
        }
        return 0;
    }

    public static int getTotalIncome() {
        String query = "SELECT SUM(Amount) FROM expenses WHERE type = 'Income'";
        try (Connection con = getConnection(); Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error fetching total income: " + e.getMessage());
        }
        return 0;
    }

    public static void deleteExpense(int id) {
        String query = "DELETE FROM expenses WHERE id = ?";
        try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error deleting record: " + e.getMessage());
        }
    }

    public static ResultSet getAnalyticData() {
        Connection con = null;
        Statement stmt = null;
        String query = """
            SELECT DATE_FORMAT(date, '%Y-%m') AS Month,
                   SUM(CASE WHEN Type = 'income' THEN Amount ELSE 0 END) AS Income,
                   SUM(CASE WHEN Type = 'expense' THEN Amount ELSE 0 END) AS Expense
            FROM expenses
            WHERE date >= CURDATE() - INTERVAL 6 MONTH
            GROUP BY Month
            ORDER BY Month DESC;
        """;
        try {
            con = getConnection();
            stmt = con.createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error fetching data: " + e.getMessage());
        }
        return null;
    }
}
