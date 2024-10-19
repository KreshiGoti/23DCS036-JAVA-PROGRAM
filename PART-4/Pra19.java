import java.util.*;

class Rectangle
{
public int l;
public int b;

Rectangle(int l, int b)
{
this.l = l;
this.b = b;
}

public void calarea()
{
System.out.println("rectangular area is"+(l*b));
}

public void calperimeter()
{
System.out.println("rectangular perimeter is"+(2*(l+b)));
}
};

class Square extends Rectangle
{
public Square(int s)
{
super(s,s);
}

public void calareasq() 
{
 System.out.println("Square area is " + (l * l));
}
}
class Pra19
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

     Square[] s1 = new Square[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter side length for square " + (i + 1));
            int side = sc.nextInt();
            s1[i] = new Square(side);
            s1[i].calareasq();
            s1[i].calperimeter(); 

}
}
};
