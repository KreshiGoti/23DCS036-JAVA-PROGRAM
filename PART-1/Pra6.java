import java.util.Scanner; 
class Pra6 
{ 
public static void main(String args[]) 
{ 
        System.out.println("enter your goal for exercise for how many days:"); 
          Scanner sc= new Scanner(System.in); 
        int n = sc.nextInt(); 
int[] explan = new int[n]; 
explan[0]=0; 
explan[1]=1; 
for(int i=2; i<n;i++) 
{ 
  explan[i] = explan[i-1] + explan[i-2]; 
System.out.println("your exercise planner for day "+i + " is "+explan[i]); 
} 
System.out.println("23DCS036_kreshi_goti");  
} 
};
