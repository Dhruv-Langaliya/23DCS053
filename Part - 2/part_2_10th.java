import java.util.*;

public class part_2_10th
{
public static void main(String[] args)

{

   Scanner in=new Scanner(System.in);
   String s1="dhruv";
   char arr[]=new char[6];
   StringBuffer sc=new StringBuffer(s1);
   StringBuilder s2= new StringBuilder(s1);
   System.out.println("Length of the string is :" + s1.length());
   System.out.println(s1.toLowerCase());
   System.out.println(s1.toUpperCase());

   StringBuffer s3= new StringBuffer(s1);
   System.out.println(s3.reverse());

   for(int i=0;i<sc.length();i++)
   {
      arr[i]=sc.charAt(i);
      
   }
for(int j=0;j<5;j++)
{
    for(int k=0;k<5-j;k++)
    {
        if(arr[k] > arr[k+1])
        {
            char temp = arr[k];
            arr[k] = arr[k+1];
            arr[k+1]= temp;
        }
    }

}

for(int i=0;i<6;i++)
{
if(arr[i]!='\0')
{
   System.out.print(arr[i]+",");
}
}

}



}

