import java.util.*;

class parent
{
    void dis()
    {
        System.out.println("This is parent class");
    }
}
class child extends parent
{
    void dis()
    {
        System.out.println("This is child class");
    }
    
}
public class part_4_17th
{
public static void main(String[] args)

{
parent p1=new parent();
p1.dis();
child p2=new child();
p2.dis();

}

}
