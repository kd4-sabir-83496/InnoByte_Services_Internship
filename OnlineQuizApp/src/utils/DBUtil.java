import java.sql.*;

public class DBUtil {
    private static final String URL = "jdbc:sqlite:quizapp.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}