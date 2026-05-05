package AssignmentDay10;

import java.io.*;
import java.util.Scanner;

class AppendFile {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to append: ");
        String input = sc.nextLine();

        FileWriter fw = new FileWriter("sample.txt", true);
        fw.write(input + "\n");

        fw.close();
        sc.close();

        System.out.println("Data appended successfully!");
    }
}