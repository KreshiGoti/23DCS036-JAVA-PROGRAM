import java.util.*; 
public class Pra33 implements Runnable { 
    Scanner sc = new Scanner(System.in); 
    public void run() { 
        System.out.println("Enter a number to 
print till you want:"); 
        int n = sc.nextInt(); 
        int sum = 0; 
        for(int i = 1; i <= n; i++) 
  { 
     sum+=i; 
        } 
System.out.println("summation of "+n+" numbers is "+sum); 
    } 
 
    public static void main(String[] args) { 
        Pra33 p1 = new Pra33(); 
        Thread thread = new Thread(p1); 
        thread.start(); 
    } 
} 
