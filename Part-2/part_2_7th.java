import java.util.*;

public class part_2_7th
{
   static StringBuffer dis(StringBuffer c,int n)
   {
    int i=0;
    StringBuffer b=new StringBuffer(c);
    
    while (i<n-1) 
    {
        c.append(b);  
        i++;  
    }
    return c;
    
   }

public static void main(String[] args)

{
    Scanner in = new Scanner (System.in);
    
    System.out.println("Enter a string ");
    
    StringBuffer a=new StringBuffer(in.next());
    
    StringBuffer b=new StringBuffer(a.substring(0,3));
    
    System.out.println("Enter no of times to concade : ");
    int n=in.nextInt();

    StringBuffer c=new StringBuffer(dis(b,n));
    System.out.println(c);


}
}
