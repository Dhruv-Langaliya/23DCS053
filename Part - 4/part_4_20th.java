import java.util.*;


class shape
{
void prints()
{
    System.out.println("this is a shape");
}
}

class rectangle extends shape
{
void print_rect() 
{
    System.out.println("This is rectangular shape");
}
}

class square extends rectangle
{
    void print_squ()
    {
        System.out.println("Square is a rectangle");
    }
    void print_rect()
    {
        super.print_rect();
    }
    void prints()
    {
        super.prints();
    }
}
class circle extends shape
{
void print_cir() 
{
    System.out.println("This is circular shape");
}
}

public class part_4_20th
{
public static void main(String[] args)

{
   square s1=new square();
   s1.prints();
   s1.print_rect();

}



}