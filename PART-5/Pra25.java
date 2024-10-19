import java.io.*; 
import java.lang.*; 
public class Pra25
{
public static void main(String[] args)
{
try
{
E e1 = new E(); e1.display();
}
catch (IOException e)
{
throw new ArithmeticException("Divided by zero");
}
}
}
class E
{
void display() throws IOException
{
int a = 10;
int b = 0;
int sum = a+b; 
System.out.println("sum : "+sum); 
int div = a/b; 
System.out.println("div : "+div);
}
}

