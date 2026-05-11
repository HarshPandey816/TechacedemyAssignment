package AssignmentDay12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            String query =
                "SELECT * FROM Students WHERE Username=? AND Password=?";

            PreparedStatement ps =
                con.prepareStatement(query);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Username or Password");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}