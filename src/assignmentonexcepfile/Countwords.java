package assignmentonexcepfile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class Countwords {
    public static void main(String[] args) {
        int wordCount = 0;
 
        try (BufferedReader reader = new BufferedReader(new FileReader("Welcome.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (!line.isEmpty()) {
                    wordCount += words.length;
                }
            }
            System.out.println("Total number of words in the file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

 