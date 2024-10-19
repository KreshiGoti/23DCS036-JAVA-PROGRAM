import java.io.*; 
import java.util.*; 
public class Pra41 { 
     
    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList( 
        "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",  
        "class", "const", "continue", "default", "do", "double", "else", "enum",  
        "extends", "final", "finally", "float", "for", "goto", "if", "implements",  
        "import", "instanceof", "int", "interface", "long", "native", "new", "null",  
        "package", "private", "protected", "public", "return", "short", "static",  
        "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",  
        "transient", "try", "void", "volatile", "while" 
    )); 
 
    public static void main(String[] args) { 
        String fileName = "Pra41.java"; 
 
        try { 
            
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName)); 
            String line; 
            int keywordCount = 0; 
 
            
            while ((line = fileReader.readLine()) != null) { 
                
                String[] words = line.split("\\W+");  
 
                
                for (String word : words) { 
                    if (JAVA_KEYWORDS.contains(word)) { 
                        keywordCount++;
           } 
                } 
            } 
 
            fileReader.close();  
            System.out.println("Number of keywords in " + fileName + ": " + 
keywordCount); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
