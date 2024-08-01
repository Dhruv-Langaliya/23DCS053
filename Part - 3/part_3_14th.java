import java.util.*;

class date {
    int date, month, year;
    Scanner in = new Scanner(System.in);

    date() {
        date = 0;
        month = 0;
        year = 0;
    }

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    return true;
                } .
                else 
                {
                    return false;
                }
            } 
            else {
                return true;
            }
        } 
        else {
            return false;
        }
    }

    void set_value() 
    {
        System.out.print("Enter year :");
        year = in.nextInt();
        boolean x=isLeapYear(year);

        System.out.print("Enter month : ");
        month = in.nextInt();
        
        if(month>12 || month<1)
        {
            System.out.print("Enter valid month : (1 to 12) ");
            month = in.nextInt();
        }
        
        System.out.print("Enter date : ");
        date = in.nextInt();
        
        if(month==1 || month==3 ||month== 5 || month==8 || month==7 || month==10 || month==12)
        {
            if(date>31 || date<1)
            {
                System.out.print("Enter valid date : (1 to 31) ");
                date = in.nextInt();
            }
        }

        if(month==4 || month==6 ||month== 9 || month==11)
        {
            if(date>30 || date<1)
            {
                System.out.print("Enter valid date : (1 to 30) ");
                date = in.nextInt();
            }
        }
       

        if(month==2)
        {
            
        if(date>28 || date<1)
        {

        if(date==29)
        {
                if(!x)
            {
                System.out.println(year +" is not an leap year so 29th date is not possible !!");
                System.out.print("Enter valid date : ");
                date = in.nextInt();
          
            }
        }

        else
        { 
                System.out.print("Enter valid date : (1 to 28) ");
                date = in.nextInt();
        }


        }

        }//if months 2 ends

        
    }//function ends
    void dis()
    {
        System.out.println(date+"/"+ month+"/"+year);

    }
}

public class part_3_14th {
    public static void main(String[] args)

    {
        date d1=new date();
        d1.set_value();
        d1.dis();
    }

}
