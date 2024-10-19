import java.util.*;

class Rect
{
int a,b,c;
Rect(){}
Rect(int l,int m)
{
a=l;
b=m;
}
int returnArea()
{
 int c=(a*b);
System.out.println("area is"+c);
return c;
}
};

class Pra15
{
public static void main(String args[])
{
Rect r1 = new Rect(3,4);
Rect r2= new Rect();
r1.returnArea();
r2.returnArea();
System.out.println("23DCS036_kreshi_goti");
}
};
