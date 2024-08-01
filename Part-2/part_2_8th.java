import java.util.*;

public class part_2_eight
{
public static void main(String[] args)

{
    int j=0;
    System.out.println("");
    int arr[]={1,3,4,6,9,8,7,9,3,12};


   for(int i=0;i<arr.length;i++)
   {

    if(arr[i]==9)
    {
        j++;
    }

   }
//    System.out.println("The given arr was : ");

   System.out.println("the given array is : "+Arrays.toString(arr));
   System.out.println("Total no of 9's in arr is :- "+j);
   
   

}



}