import java.sql.*;
public class DatabaseConnection {
    String url = "jdbc:postgresql://localhost:5432/cavissondb";
    String user = "cavisson";
    String password = "cavisson";


    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public static void main(String[] agrs) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }
}

