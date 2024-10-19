import java.util.LinkedList; 
 
class Buffer { 
    private LinkedList<Integer> list = new LinkedList<>(); 
    private int capacity = 5 
 
     
    public synchronized void produce() throws InterruptedException { 
        int value = 0; 
        for (int i = 0; i < 5; i++) {  
            while (list.size() == capacity) { 
                wait();  
            } 
 
            System.out.println("Producer produced: " + value); 
            list.add(value++); 
            notify(); 
            Thread.sleep(1000);  
        } 
    } 
 
    public synchronized void consume() throws InterruptedException { 
        for (int i = 0; i < 5; i++)  
            while (list.isEmpty()) { 
                wait();  
            } 
 
            int value = list.removeFirst(); 
            System.out.println("Consumer consumed: " + value); 
            notify();  
            Thread.sleep(1000);  
        } 
    } 
}
public class Pra37 { 
    public static void main(String[] args) throws InterruptedException { 
        Buffer buffer = new Buffer();  
 
         
        Thread producerThread = new Thread(new Runnable() { 
            @Override 
            public void run() { 
                try { 
                    buffer.produce(); 
                } catch (InterruptedException e) { 
                    Thread.currentThread().interrupt(); 
                } 
            } 
        }; 
 
        Thread consumerThread = new Thread(new Runnable() { 
            @Override 
            public void run() { 
                try { 
                    buffer.consume(); 
                } catch (InterruptedException e) { 
                    Thread.currentThread().interrupt(); 
                } 
            } 
        }; 
 
       
        producerThread.start(); 
        consumerThread.start(); 
 
        producerThread.join(); 
        consumerThread.join(); 
 
        System.out.println("Producer and Consumer have completed."); 
    } 
} 
