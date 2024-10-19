import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
 
public class Pra28 { 
    
 public static void main(String[] args) { 
        if (args.length != 2) { 
            System.out.println("Usage: java Pra28 <character> <filename>"); 
            return; 
        } 
 
        char targetChar = args[0].charAt(0); // The character to search for 
        String fileName = args[1]; // The file name to process 
 
        int charCount = 0; // To store the count of the target character 
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) { 
            int currentChar; 
 
            while ((currentChar = reader.read()) != -1) { 
                if (currentChar == targetChar) { 
                    charCount++; 
                } 
            }
