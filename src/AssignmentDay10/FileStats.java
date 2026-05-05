package AssignmentDay10;

import java.io.*;

class FileStats {
    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file));

        int lines = 0, words = 0, chars = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();

            String[] wordList = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) {
                words += wordList.length;
            }
        }

        br.close();

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}