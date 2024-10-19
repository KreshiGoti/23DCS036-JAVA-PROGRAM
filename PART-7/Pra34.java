import java.util.*; 
 
public class Pra34 
{ 
private static int n; 
public static class Th1 implements Runnable { 
    Scanner sc = new Scanner(System.in); 
   
    public void run() { 
        System.out.println("Enter a number :"); 
        n = sc.nextInt(); 
 } 
        } 
 
public static class Th2 implements Runnable { 
   public void run() { 
 int sq=n*n; 
    System.out.println("Square of Number is :"+sq); 
        } 
    } 
 
public static class Th3 implements Runnable { 
  public void run() { 
 int cube= n*n*n; 
    System.out.println("Cube of Number is :"+cube);     
        } 
    } 
 
    public static void main(String[] args) throws InterruptedException 
 { 
        Th1 t1= new Th1(); 
        Thread thread1 = new Thread(t1); 
        thread1.start(); 
 thread1.join(); 
 
  Th2 t2 = new Th2(); 
        Th3 t3 = new Th3(); 
        Thread thread2 = new Thread(t2); 
        Thread thread3 = new Thread(t3); 
 
  for(int i = 1; i <= n; i++) 
  { 
  if(n%2==0) 
 { 
 thread2.start(); 
 } 
  else 
 { 
  thread3.start(); 
 }
 } 
} 
} 
