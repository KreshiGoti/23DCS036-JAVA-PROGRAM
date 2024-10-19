 
import java.util.*; 
 
public class Pra32 implements Runnable 
{ 
public void run() 
{ 
 System.out.println("Hello World"); 
} 
public static void main(String args[]) 
{ 
Pra32 p1 = new Pra32(); 
Thread th = new Thread(p1); 
th.start(); 
} 
} 
