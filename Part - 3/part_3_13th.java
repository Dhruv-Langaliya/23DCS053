import java.util.*;

class employee {
    public double salary;
    private String first_name;
    private String last_name;
    Scanner in = new Scanner(System.in);

    employee() 
    {
        salary = 0;
        first_name = null;
        last_name = null;
        set();

    }

    public void dis() 
    {
        System.out.println("Employee first name :- " + first_name);
        System.out.println("Employee lastt name :- " + last_name);
        System.out.println("Employee salary :- " + salary);
    }

    public void set() {
        System.out.println("Enter employee your name : ");
        first_name = in.nextLine();
        System.out.println("Enter employee your name : ");
        last_name = in.nextLine();
        System.out.println("Enter employee salary : ");
        salary = in.nextInt();
    }
}

public class part_3_13th {
    public static void main(String[] args)

    {

        employee e1 = new employee();
        employee e2 = new employee();
        
        System.out.println("Showing salary of employs : ");
        System.out.println("salary of employee 1 is : " + e1.salary);
        System.out.println("salary of employee 2 is : " + e2.salary);
        e1.salary = e1.salary * 1.1;
        e2.salary = e2.salary * 1.1;
        System.out.println("\n");
        System.out.println("salary of employee 1 after incriment is : " + e1.salary);
        System.out.println("salary of employee 2 after incriment is : " + e2.salary);

    }

}