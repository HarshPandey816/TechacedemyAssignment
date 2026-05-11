package AssignmentDay12;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayStudents {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs =
                st.executeQuery("SELECT * FROM Students");

            while (rs.next()) {

                System.out.println(
                    rs.getInt("Id") + " " +
                    rs.getString("Name") + " " +
                    rs.getInt("Age") + " " +
                    rs.getString("Username")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}