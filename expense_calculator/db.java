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
}
