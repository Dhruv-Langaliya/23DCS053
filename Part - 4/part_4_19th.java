import java.util.*;

class rectangle
{
    float length,breadth;

    rectangle()
    {
        length=0;
        breadth=0;
        System.out.println("hello guysss");
    }

    rectangle(float a,float b)
    {
        length=a;
        breadth=b;

    }

    void print_area()
    {
        float area= length*breadth;
        System.out.println("Area :- "+area);
    }

    void print_perimeter()
    {
        float perimeter= 2*(length+breadth);
        System.out.println("Perimeter :- "+perimeter);
    }

}
class square extends rectangle
{

square()
{
    super();
}
square(float x,float y)
{
super(x, y);

}


}

public class part_4_19th
{
public static void main(String[] args)

{
    Scanner in=new Scanner (System.in);

    System.out.print("Enter Length of rectangle : ");
    float l1=in.nextFloat();
    System.out.print("Enter Breadth of rectangle : ");
    float b1=in.nextFloat();
    
    // always first reclare then give no of objects then use constructor
    rectangle r1[];
    r1=new rectangle[2];
    r1[0]=new rectangle(l1, b1);
    r1[0].print_area();
    r1[0].print_perimeter();

    System.out.print("\nEnter Side of Square : ");
    float s=in.nextFloat();

    square s1[];
    s1=new square[2];
    s1[0]=new square(s, s); 
    s1[0].print_area(); 
    s1[0].print_perimeter();
}


}  