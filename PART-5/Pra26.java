import java.io.*;
class mycheckedException extends Exception
{
public mycheckedException(String s1)
{
super(s1);
}
}
class MyUncheckedException extends RuntimeException
{
public MyUncheckedException(String s2)
{
super(s2);
}
}
public class Pra26
{
public static void main(String[] args)
 { 
try
{
myexception.checkCondition(false);
}
catch (mycheckedException e)
{
System.out.println("Caught Checked exception: " +
e.getMessage());
}
try
{
myexception.riskyOperation();
}
catch (MyUncheckedException e)
{
System.out.println("Caught Unchecked exception: " + e.getMessage());
}
try
{
myexception.readFile();
}
catch (IOException e)
{
System.out.println("Caught Checked exception: " + e.getMessage());
}
try
{
myexception.divide(10, 0);
}
catch (ArithmeticException e)
{
System.out.println("Caught Unchecked exception: " + e.getMessage());
}
}
}
class myexception
{
public static void checkCondition(boolean condition) throws mycheckedException
{
if (!condition)
{
throw new mycheckedException("User-defined checked exception: Condition failed!");
}
}
public static void riskyOperation()
{
throw new MyUncheckedException("User-defined unchecked exception: Something went wrong!");
}
public static void readFile() throws IOException
{
throw new IOException("Checked exception: File not found.");
}
public static void divide(int a, int b)
{
System.out.println("Result: " + (a / b));
}
}
