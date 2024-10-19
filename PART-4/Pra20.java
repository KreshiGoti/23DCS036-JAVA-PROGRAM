import java.util.*;

class Shape
{
public void printshape()
{
System.out.println("This is shape");
}
};

class Rectangle extends Shape
{
public void printrec()
{
System.out.println("This is rectangular shape. ");
}
};

class Square extends Rectangle
{
public void printsuq()
{
System.out.println("Square is a rectangle. ");
}
};

class Circle extends Shape
{
public void printcir()
{
System.out.println("This is circular shape.");
}
};


class Pra20
{
public static void main(String args[])
{
Square s1 = new Square();
s1.printshape();
s1.printrec();
System.out.println("23DCS036_kreshi_goti");
}
};
