import java.util.*;

public class part_5_25th
{
public static void main(String[] args)

{
   Scanner in=new Scanner(System.in);

   int a[]={5,6,4};
   
   try
   {
    System.out.println("Value at index 3 is :- "+a[3]);
   }

   catch(ArrayIndexOutOfBoundsException e)
   {
    System.out.println("the error is :- "+e);
   } 

}



}