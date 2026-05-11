package AssignmentDay12;

import java.sql.Connection;
import java.sql.Statement;

public class InsertMultipleRecords {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            st.executeUpdate(
                "INSERT INTO Students VALUES " +
                "(101,'Harsh',22,'harsh','1234')," +
                "(102,'Rahul',21,'rahul','1111')," +
                "(103,'Aman',23,'aman','2222')"
            );

            System.out.println("Multiple Records Inserted!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}