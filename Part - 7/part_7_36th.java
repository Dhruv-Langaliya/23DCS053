class threadPiority extends Thread 
{

threadPiority(String threadName)
{
super(threadName);
}

public void run() 
{
for (int i = 0; i < 4; i++) 
{
    try 
    {
    Thread.sleep(500);
    System.out.println("Thread :- "+this.getName());     
    }
    catch (Exception e) 
    {
     System.out.println(e);   
    }
}   
}

}

public class part_7_36th
{
public static void main(String[] args) 
{
    threadPiority t1=new threadPiority("FIRST"); 
    threadPiority t2=new threadPiority("SECOND"); 
    threadPiority t3=new threadPiority("THIRD"); 
    t1.setPriority(3);
    t2.setPriority(5);
    t3.setPriority(7);
    t1.start();
    t2.start();
    t3.start();
}    
}