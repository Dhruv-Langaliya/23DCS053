
import java.util.*;

class myexception extends Exception
{
@Override
public String toString() 
{
    // TODO Auto-generated method stub
    return "*******rene de tu abhi chota hee*******";

}

@Override
public String getMessage() 
{
    // TODO Auto-generated method stub
    return "na na betaaaa....";
}

}

public class part_5_26th
{
public static void main(String[] args)

{
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter your age : ");
  int x=sc.nextInt();
  
if(x<18)
{
  try
  {
    throw new myexception();
  }
  catch (Exception e) 
  {
  System.out.println(e.getMessage());
  System.out.println(e.toString());
  }
}
}



}