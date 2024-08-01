import java.util.*;

public class part_1_6th
{
public static void main(String[] args)

{

Scanner in=new Scanner(System.in);
System.out.println("Enter a no to get its fibonacci : ");
int n=in.nextInt();

int a[]=new int[n+1];

a[0]=0;
a[1]=1;
for(int i=2;i<n+1;i++)
{
a[i]=a[i-1]+a[i-2];
}
for(int i=0;i<n+1;i++)
{
System.out.print(a[i]+",");
}

}



}