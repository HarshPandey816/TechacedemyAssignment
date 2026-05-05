package AssignmentDay10;

import java.io.*;

class ReadJavaLines {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.contains("Java")) {
                System.out.println(line);
            }
        }

        br.close();
    }
}