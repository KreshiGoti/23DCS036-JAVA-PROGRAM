import java.util.*; 
 
class Parent 
{ 
public void print1() 
{ 
System.out.println("this is parent class"); 
} 
}; 
 
class Child extends Parent 
{ 
public void print2()
{ 
System.out.println("this is child class"); 
} 
}; 
 
class Pra17 
{ 
public static void main(String args[]) 
{ 
Parent p1 = new Parent(); 
p1.print1(); 
 
Child c1 = new Child(); 
} 
}; 
