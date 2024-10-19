 
import java.util.Scanner;  
 
 class Pra5 { 
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in);  
 
System.out.println("enter price of things"); 
float[] array = new float[5]; 
for(int i=0;i<5;i++) 
{ 
 array[i] = scn.nextFloat(); 
} 
 
System.out.println("enter product code of things"); 
int[] array1 = new int[5]; 
for(int i=0;i<5;i++) 
{ 
 array1[i] = scn.nextInt(); 
} 
System.out.println("enter your choice"); 
int ch = scn.nextInt(); 
 
switch(ch) 
{ 
case 1: float t0 = (array[0])*(8/100.0f); 
        array[0] += t0; 
         System.out.println("price of motor is"+" "+ array[0]); 
         System.out.println("product code of motor is"+" "+ array1[0]); 
         break; 
 
case 2: float t1 = (array[1])*(12/100.0f); 
        array[1] += t1; 
         System.out.println("price of fan is"+" "+ array[1]); 
         System.out.println("product code of fan is"+" "+ array1[1]); 
         break; 
 
case 3: float t2 = (array[2])*(5/100.0f); 
        array[2] += t2; 
         System.out.println("price of tube light is"+" "+ array[2]); 
         System.out.println("product code of tube light is"+" "+ array1[2]); 
         break; 
 
case 4: float t3 = (array[3])*(75/10.0f); 
        array[3] += t3; 
         System.out.println("price of wire is"+" " +array[3]); 
         System.out.println("product code of wire is"+" "+ array1[3]); 
         break; 
 
case 5: float t4 = (array[4])*(3/100.0f); 
        array[4] += t4; 
         System.out.println("price of all items is"+" "+ array[4]); 
         System.out.println("product code of item is"+" "+ array1[4]); 
         break; 
 
default: System.out.println("no choice"); 
} 
scn.close(); 
} 
}; 
