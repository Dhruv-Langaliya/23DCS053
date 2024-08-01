import java.util.*;

class complex
{
    Scanner in=new Scanner(System.in);

    int real,img;

    void set()
    {
        System.out.print("Enter real part of no. : "); 
        real=in.nextInt();
        System.out.print("Enter Complex part of no. : ");
        img=in.nextInt();
    }

    void add(complex a1,complex a2)
    {
        real=a1.real+a2.real;
        img=a1.img+a2.img;
        System.out.println("The value after Addition is : "+real+" +i"+"("+img+")");
        
    }

    void sub(complex a1,complex a2)
    {
        real=a1.real-a2.real;
        img=a1.img-a2.img;
        System.out.println("The value after subtraction is : "+this.real+" +i"+"("+img+")");
        
    }
    
    void mul(complex a1,complex a2)
    {
        real=(a1.real*a2.real)-(a1.img*a2.img);
        img=(a1.real*a2.img)+(a2.real*a1.img);
        System.out.println("The value after multiplication is : "+this.real+" +i"+"("+img+")");
    }

}


public class part_3_16th
{
public static void main(String[] args)

{
    complex a1=new complex();
    complex a2=new complex();
    a1.set();
    a2.set();
    complex a3=new complex();
    complex a4=new complex();
    complex a5=new complex();
   
        a3.add(a1,a2);
        a4.sub(a1,a2);
        a5.mul(a1,a2);
    
}


}