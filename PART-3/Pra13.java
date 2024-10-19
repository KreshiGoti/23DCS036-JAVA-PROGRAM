import java.util.*;

class Employee
{
 Scanner sc= new Scanner(System.in);
 String fs=" ";
 String ls=" ";
 double sal;

Employee(){}
Employee(String f,String l,double sa)
{
 fs=f;
 ls=l;
sal=sa;
}
void setfs()
{
System.out.println("enter first name");
 fs= sc.nextLine();
}
void setls()
{
System.out.println("enter last name");
 ls= sc.nextLine();
}
void setsal()
{
System.out.println("enter salary");
 sal= sc.nextDouble();
if(sal<0)
{
sal=0.0;
}
else
{
 sal= sal + (sal*0.1);
}
}
String getfs()
{
return fs;
}
String getls()
{
return ls;
}
double getsal()
{
return sal;
}

};

class Pra13
{
public static void main(String args[])
{
Employee e1 = new Employee();
e1.setfs();
e1.setls();
e1.setsal();
String c = e1.getfs();
System.out.println(c);
String b = e1.getls();
System.out.println(b);
Double a= e1.getsal();
System.out.println(a);
System.out.println("23DCS036_kreshi_goti");
}
};
