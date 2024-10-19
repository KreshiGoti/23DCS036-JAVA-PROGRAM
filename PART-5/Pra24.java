import java.util.*; 
public class Pra24
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in); int x=0,y=0;
int result; try
{
System.out.print(" enter x: "); 
x = sc.nextInt(); 
System.out.print(" enter y :"); 
y = sc.nextInt();
}
catch(InputMismatchException e)
{
System.out.println(" Enter valid integers ");
}
try
{
result = x/y;
System.out.println("x/y = " +result);
}
catch(ArithmeticException e)
{
System.out.println(" Exception : Divided by zero");
}
}
}

