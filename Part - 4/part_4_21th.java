import java.util.*;

class Degree
{
    void getDegree()
    {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree
{
    void getDegree()
    {
        super.getDegree();
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Undergraduate
{
    void getDegree()
    {
        super.getDegree();
        System.out.println("I am an Postgraduate");
    }
    
}

public class part_4_21th
{
public static void main(String[] args)

{
   Postgraduate p=new Postgraduate();
   
//    Undergraduate u=new Undergraduate();
//    Degree d=new Degree();
//    d.getDegree();
//    u.getDegree();

   p.getDegree();

}



}