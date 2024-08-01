import java.util.*;


class area
{
    float length,breadth;
    area()
    {
        length=0;
        breadth=0;
    }

    area(float a,float b)
    {
        length=a;
        breadth=b;
    }

    float ret_val()
    {
        return length*breadth;
    }
} 

public class part_3_15th
{
public static void main(String[] args)

{
    Scanner in=new Scanner (System.in);
    System.out.print("Enter length : ");
    float a=in.nextInt();
    System.out.print("Enter breadth : ");
    float b=in.nextInt();

   area a1=new area(a,b);
   float x=a1.ret_val();
   System.out.println("Area of rectangle is : "+x);

}



}