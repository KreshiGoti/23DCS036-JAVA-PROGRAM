import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
 
public class Pra29 { 
    public static void main(String[] args) { 
        if (args.length != 2) { 
            System.out.println("Usage: java Pra29 <word> <filename>"); 
            return; 
        } 
 
        String searchWord = args[0];  
        String fileName = args[1];     
        int occurrences = searchWordInFile(searchWord, fileName); 
 
        Integer result = Integer.valueOf(occurrences); 
 
        if (result > 0) { 
            System.out.println("The word '" + searchWord + "' appears " + result + " times 
in " + fileName); 
        } else { 
            System.out.println("The word '" + searchWord + "' was not found in " + 
fileName); 
        } 
    } 
 
    public static int searchWordInFile(String word, String fileName) { 
    int count = 0; 
 
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { 
            String line; 
            while ((line = reader.readLine()) != null) { 
                String[] words = line.split("\\s+"); 
                for (String w : words) { 
                    if (w.equals(word)) { 
                        count++; 
                    } 
                } 
            } 
 
        } catch (IOException e) { 
            System.err.println("Error reading file: " + fileName); 
        } 
 
        return count; 
    } 
} 
