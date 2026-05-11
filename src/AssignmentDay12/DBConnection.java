package AssignmentDay12;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection(
                "jdbc:sqlserver://DESKTOP-3E47853:1433;databaseName=WiproAssignment;encrypt=true;trustServerCertificate=true",
                "Harsh",
                "Harsh@123"
            );

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {

            System.out.println(e);
        }

        return con;
    }
}