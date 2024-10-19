import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
 
public class Pra30 { 
 
    public static void main(String[] args) { 
        if (args.length != 2) { 
            System.out.println("Usage: java Pra30 <sourceFile> <destinationFile>"); 
            return; 
        } 
 
        String sourceFile = args[0];        
        String destinationFile = args[1];  
 
        copyFile(sourceFile, destinationFile); 
    } 
 
    public static void copyFile(String sourceFile, String destinationFile) { 
        try (FileReader fileReader = new FileReader(sourceFile); 
             FileWriter fileWriter = new FileWriter(destinationFile)) { 
 
            int character; 
 
            while ((character = fileReader.read()) != -1) { 
                fileWriter.write(character); 
            }
     System.out.println("Data successfully copied from " + sourceFile + " to " + 
destinationFile); 
 
        } catch (IOException e) { 
            System.err.println("Error occurred while copying data: " + e.getMessage()); 
        } 
    } 
} 
