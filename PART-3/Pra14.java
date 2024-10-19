import java.util.Scanner;
class Date
{
int d,m,y;
Scanner sc = new Scanner(System.in);
Date(){}
Date(int day,int mon,int year)
{
d=day;
m=mon;
y=year;
}
void setday()
{
System.out.println("enter day");
 d= sc.nextInt();
}
void setmonth()
{
System.out.println("enter month");
 m= sc.nextInt();
}
void setyear()
{
System.out.println("enter year");
 y= sc.nextInt();
}
void displaydate()
{
System.out.println(d+"/"+m+"/"+y);
}
};
class Pra14
{
public static void main(String args[])
{
Date d=new Date();
d.setday();
d.setmonth();
d.setyear();
d.displaydate();
System.out.println("23DCS036_kreshi_goti");
}
};
