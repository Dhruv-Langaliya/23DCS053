import java.util.*;


interface AdvancedArithmetic
{
   int divisor_sum(int n);

}



class calledMyCalculator implements AdvancedArithmetic
{
   int y;
         calledMyCalculator()
         {
            y=0;
         }
      
   public int divisor_sum(int n)
   {

      for(int i=1;i<=n;i++)
   {
         if(n%i==0)
         {
      // System.out.println(i);
             y=y+i;
         }
   }
         return y;
   }

}

public class part_4_22th
{
public static void main(String[] args)

{
   Scanner in=new Scanner(System.in);
   System.out.println("Enter value of no. to find sum of its divisors : ");
   int n=in.nextInt();
   calledMyCalculator c1 = new calledMyCalculator();
   int x=c1.divisor_sum(n);
   System.out.println(x);


}



}