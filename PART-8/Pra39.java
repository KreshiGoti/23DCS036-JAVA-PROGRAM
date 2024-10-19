import java.util.Arrays; 
import java.util.Scanner; 
class Product implements Comparable<Product> { 
    private String name; 
    private double price; 
    private double rating; 
 public Product(String name, double price, 
double rating) { 
        this.name = name; 
        this.price = price; 
        this.rating = rating; 
    } 
@Override 
    public int compareTo(Product other) { 
        return Double.compare(this.price, 
other.price); 
    } 
 @Override 
    public String toString() { 
        return "Product{name='" + name + "', 
price=" + price + ", rating=" + rating + "}"; 
    } 
} 
public class Pra39 { 
public static void sortArray(Comparable[] 
array) { 
        Arrays.sort(array); 
    } 
public static void main(String[] args) { 
        Scanner scanner = new 
Scanner(System.in); 
 
        System.out.print("Enter the number of 
products: "); 
        int numProducts = scanner.nextInt(); 
        Product[] products = new 
Product[numProducts]; 
 for (int i = 0; i < numProducts; i++) { 
            System.out.println("Enter details for 
product " + (i + 1) + ":"); 
            System.out.print("Name: "); 
            String name = scanner.next(); 
            System.out.print("Price: "); 
            double price = scanner.nextDouble(); 
            System.out.print("Rating: "); 
            double rating = scanner.nextDouble(); 
products[i] = new Product(name, price, rating); 
        } 
sortArray(products); 
System.out.println("\nProducts sorted by 
price:"); 
        for (Product product : products) { 
            System.out.println(product); 
        } scanner.close(); 
    } 
}
