import java.util.*; 
 
public class Pra40 { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.println("Enter text (multiple words):"); 
  String text = scanner.nextLine(); 
 String[] words = text.split("\\s+"); 
  Map<String, Integer> wordCountMap = new HashMap<>(); 
for (String word : words) { 
            word = word.toLowerCase(); 
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1); 
        } 
 
        Set<String> wordSet = new TreeSet<>(wordCountMap.keySet()); 
 
        System.out.println("\nWord occurrences:"); 
        for (String word : wordSet) { 
            System.out.println(word + ": " + wordCountMap.get(word)); 
        } 
 
        scanner.close(); 
    } 
}
