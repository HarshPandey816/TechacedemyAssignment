package AssignmentDay12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {

    public static void main(String[] args) {

        try {

            Connection con = DBConnection.getConnection();

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            String query =
                "INSERT INTO Students VALUES(?,?,?,?,?)";

            PreparedStatement ps =
                con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, username);
            ps.setString(5, password);

            ps.executeUpdate();

            System.out.println("Record Inserted Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}