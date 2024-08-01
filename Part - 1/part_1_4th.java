import java.util.*;

public class part_1_4th
{
public static void main(String[] args)

{
   Scanner in=new Scanner(System.in);
   float []arr=new float [5];
   System.out.println("Enter expense for week 1 ");
   arr[0]=in.nextFloat();
   System.out.println("Enter expense for week 2 ");
   arr[1]=in.nextFloat();
   System.out.println("Enter expense for week 3 ");
   arr[2]=in.nextFloat();   
   System.out.println("Enter expense for week 4 ");
   arr[3]=in.nextFloat();
   arr[4]=arr[1]+arr[0]+arr[2]+arr[3];
   System.out.println("your monthly expence is :- "+arr[4]);


}



}