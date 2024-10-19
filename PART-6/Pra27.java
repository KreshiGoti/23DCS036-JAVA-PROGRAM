import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pra27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify one or more files.");
            return;
        }

        for (String fileName : args) {
            try {
                int lineCount = countLinesInFile(fileName);
                System.out.println(fileName + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.err.println("Error reading file: " + fileName + " (" + e.getMessage() + ")");
            }
        }
    }

    private static int countLinesInFile(String fileName) throws IOException {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lines++;
            }
        }
        return lines;
    }
    
    // Sample push method that adds an object to a stack (for demonstration)
    public void push(Object o) {
        // Implementation for adding 'o' to the stack
        System.out.println("Element added to the stack: " + o);
    }
}
