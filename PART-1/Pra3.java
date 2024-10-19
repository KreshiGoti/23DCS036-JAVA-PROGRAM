import java.util.Scanner;  
 
 class Pra3 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  
  
        System.out.print("Enter a distance(in meters): "); 
        float dis = sc.nextFloat();  
 
        System.out.println("Enter a time(in hours) "); 
        float hr = sc.nextFloat(); 
 
        System.out.println("Enter a time(in minutes) "); 
        float min = sc.nextFloat(); 
 
        System.out.println("Enter a time(in seconds) "); 
        float sec = sc.nextFloat(); 
    
        sec = sec + (min*60)+ (hr*3600); 
 
        float x = (dis/sec); 
         hr= (sec/3600); 
 float mile = (1609*dis); 
        dis = (dis/1000); 
        float y= (dis/hr); 
 float z = (mile/hr); 
        System.out.println(x + "is meter per second"); 
 System.out.println(y + "is kilometer per hour"); 
 System.out.println(z + "is mile per hour"); 
    System.out.println("23DCS036_KRESHI_GOTI"); 
    } 
}; 
