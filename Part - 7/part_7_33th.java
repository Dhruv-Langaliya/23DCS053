import java.util.*;

public class part_7_33th implements Runnable {
    
@Override
    public void run() {
        
        System.out.println(" thread is created");    

    }

    public static void main(String[] args) {

        System.out.println("Enter  the total number of the tread you want to creat :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        part_7_33th obj = new part_7_33th();
        for (int i = 1; i <=n; i++) {
            Thread t = new Thread(obj);
            t.start();
        }
        sc.close();
    }
}