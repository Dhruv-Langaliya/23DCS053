import java.util.*;

public class part_1_5th
{
public static void main(String[] args)

{
    int i=1,j=0;
    Scanner in =new Scanner(System.in);
    int a[]=new int[20];
    double price[]=new double[20];
    String name[]={" ","Motor","Fan","Tube","Wires","Grocery"};
    
    System.out.println("");
    System.out.println("Enter your choice to add to cart :- \n");
    
    while(i==1)
    {
        System.out.println("Enter 1 to add Motor : ");
        System.out.println("Enter 2 to add Fan : ");
        System.out.println("Enter 3 to add Tube  : ");
        System.out.println("Enter 4 to add Wires : ");
        System.out.println("Enter 5 to add Grocery : ");
        System.out.println("Enter 6 to genrate bill : ");
        int n=in.nextInt();
        System.out.println("");
        switch (n) 
        {
            case 1:
            {   
                price[j]=2500+(2500*0.08);
                break;
            }
            case 2:
            {   
                price[j]=1500+(1500*0.12);
                break;
            }
            case 3:
            {   
                price[j]=250+(250*0.05);
                break;
            }
            case 4:
            {   
                price[j]=300+(300*.075);
                break;
            }
            case 5:
            {   
                price[j]=450+(450*0.03);
                break;
            }
            case 6:
            {   
                
                System.out.println("*******YOUR BILL*******");
                i=2;
                break;
            }
            
            // default:
            // System.out.println("*****THANKS FOR SHOPPING*****");
            // break;
        }
        
        if(n!=6)
        {
            a[j]=n;
            j++;
        }
        
    }
    for(int k=0;k<j;k++)
    {
        
        System.out.println(k+1 +". "+name[a[k]]+" *  1 =  " + price[k] );
    }
    double t=0;
    
    for(int k=0;k<j;k++)
    {
        
        t= price[k] +t ;
    }
    System.out.println("Total amount to be paid is :- "+t+"\n");
    
    System.out.println("*****THANKS FOR SHOPPING*****\n");
}



}