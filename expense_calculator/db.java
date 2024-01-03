package expense_calculator;

import java.sql.*;

public class db {

    private static final String URL = "jdbc:mysql://localhost:3306/expensecalculator";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
