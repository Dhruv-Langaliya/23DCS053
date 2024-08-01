import java.util.*;

class member
{
   Scanner in=new Scanner(System.in);
   protected String name,address;
   protected float salary;
   protected int age;
   protected long ph_no;
   
    void get()
    {
        System.out.print("enter name : ");
        name=in.next();
        System.out.flush();

        System.out.print("enter age : ");
        age=in.nextInt();
        System.out.flush();

        System.out.print("enter ph_no : ");
        ph_no=in.nextLong();
        System.out.flush();

        System.out.print("enter address : ");
        address=in.nextLine();
        address=in.nextLine();
        System.out.flush();

        System.out.print("enter salary : ");
        salary=in.nextFloat();
        System.out.flush();

    }

    void dis()
    {
        System.out.println("name : "+  name);

        System.out.println("age : "+  age);

        System.out.println("ph_no : "+  ph_no);

        System.out.println("address : "+  address);

        System.out.println("salary : "+  salary);
    }

}

class employee extends member
{
    String specialization;
    employee()
    {

    }

    void get()
    {
        super.get();
        System.out.print("enter specialization : ");
        System.out.flush();
        specialization=in.next();

    }
    void dis()
    {
        super.dis();
        System.out.println("specialization : "+specialization);

    }

}

class manager extends member
{
    String department;
    manager()
    {
    
    }
   
    void get()
    {
       super.get();
       System.out.print("enter department : ");
       System.out.flush();
       department=in.next();

    }
    void dis()
    {
       super.dis();
       System.out.println("department : "+ department);

    }
}

public class part_4_18th
{
public static void main(String[] args)

{
  manager m=new manager();  
  employee e=new employee();  
  System.out.println("employees details :----- ");
  e.get();
  System.out.println("\nmanager details :---- ");
  m.get();
  System.out.println("\n\nemployees details : ");
  e.dis();
  System.out.println("\n\nmanager details : ");
  m.dis();
}



}