package interview_tasks.file_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
Write a program that reads a text file, counts the occurrences of each word, and prints the results.
*/

public class Task1_db {
  public static void main (String[] args){
    String filePath = "src/main/resources/sample.txt"; // Replace with your file path
    Map<String, Integer> wordCountMap = new HashMap<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) ) {
      String line;
      while ((line = reader.readLine()) != null) {
        Pattern pattern = Pattern.compile("\\W+");
        String[] words = pattern.split(line);
//        String[] words = line.toLowerCase().split("\\s+"); // Tokenize by space
        for (String word : words) {
          wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
      }

//      // Print word counts
//      for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
//        System.out.println(entry.getKey() + ": " + entry.getValue());
//      }

      // Sort the word frequencies from max to min
      List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
      sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

      // Print the sorted word frequencies
      for (Map.Entry<String, Integer> entry : sortedEntries) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
