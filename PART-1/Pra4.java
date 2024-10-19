import java.util.Scanner; 
 
class Pra4 
{ 
public static void main(String args[]) 
{ 
      double[] expense = new double[30]; 
 Scanner sc = new Scanner(System.in); 
 System.out.println("enter expense for fifteen days"); 
  
 for(int i=0;i<15;i++) 
 { 
 System.out.print("enter for day"+(i+1) + ":"); 
         expense[i]= sc.nextDouble(); 
 } 
 double totalexp=0; 
       
  for(int i=0;i<15;i++) 
 { 
  totalexp +=expense[i]; 
  } 
 System.out.println("total expense is:"+totalexp); 
        System.out.println("23DCS036_KRESHI_GOTI"); 
} 
};
