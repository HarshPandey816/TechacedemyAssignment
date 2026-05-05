package AssignmentDay10;

import java.io.*;

class CountWord {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        int count = 0;
        String target = "Java";

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(target)) {
                    count++;
                }
            }
        }

        br.close();

        System.out.println("Occurrences of '" + target + "': " + count);
    }
}