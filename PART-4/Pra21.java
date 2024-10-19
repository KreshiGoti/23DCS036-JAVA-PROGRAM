import java.util.*;

class Degree
{
public void getDegree()
{
System.out.println("I got a degree.");
}
};

class Undergraduate
{
public void getDegree()
{
System.out.println("I am an Undergraduate.");
}
};

class Postgraduate
{
public void getDegree()
{
System.out.println("I am a Postgraduate.");
}
};

class Pra21
{
public static void main(String args[])
{
Degree d1 = new Degree();
d1.getDegree();
Undergraduate u1 = new Undergraduate();
u1.getDegree();
Postgraduate p1 = new Postgraduate();
p1.getDegree();
System.out.println("23DCS036_kreshi_goti");
}
};
