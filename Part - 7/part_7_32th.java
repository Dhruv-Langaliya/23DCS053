//program A:-

class myThreads extends Thread
{
    @Override
    public void run() 
    {
    System.out.println("Hello World");    
    }
}

public class part_7_32th 
{
public static void main(String[] args) 
{
    myThreads a =new myThreads();
    a.start();  
}    
}



// // program B:-
// class myThreads implements Runnable
// {
//     @Override
//     public void run() 
//     {
//     System.out.println("Hello World");    
//     }
// }

// public class part_7_32th 
// {
// public static void main(String[] args) 
// {

//     myThreads a =new myThreads();
//     Thread t=new Thread(a);
//     t.start();
      
// }    
// }