class base extends Thread
{
@Override
public void run() 
{
for (int i = 0; i < 6; i++) 
{

try    
{
    Thread.sleep(1000);
    System.out.println(i+1);
}
catch(Exception e)
{

}

} 
}
}

public class part_7_35th 
{
    public static void main(String[] args) 
    {
     base b=new base();
     b.start();   
    }
}
