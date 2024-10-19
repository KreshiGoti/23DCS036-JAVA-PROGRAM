 
    private String threadName; 
 
    public Pra36(String name) { 
        this.threadName = name; 
    } 
 
    @Override 
    public void run() { 
        System.out.println(threadName + " is running with priority " + 
Thread.currentThread().getPriority()); 
    } 
 
    public static void main(String[] args) { 
       
        Pra36 firstTask = new Pra36("FIRST"); 
        Pra36 secondTask = new Pra36("SECOND"); 
        Pra36 thirdTask = new Pra36("THIRD"); 
 
        Thread firstThread = new Thread(firstTask); 
        Thread secondThread = new Thread(secondTask); 
        Thread thirdThread = new Thread(thirdTask); 
 
        
        firstThread.setPriority(3);   
        secondThread.setPriority(5);  
        thirdThread.setPriority(7);   
 
        // Start the threads 
        firstThread.start(); 
        secondThread.start(); 
        thirdThread.start(); 
    } 
} 
