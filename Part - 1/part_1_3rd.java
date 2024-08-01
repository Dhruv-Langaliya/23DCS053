import java.util.*;

public class part_1_3rd
{
    static float km_per_h(float km,float h)
    {
        float y=km/h;
        
        return y;
    } 
    static float m_per_s(float m,float s)
    {
        float y=m/s;

        return y;
    } 
    static float mi_per_h(float mi,float h)
    {
        float y=mi/h;

        return y;
    } 
public static void main(String[] args)

{
Scanner in=new Scanner(System.in);
System.out.println("Enter distance covered in meter :- ");
float y=in.nextFloat();
System.out.println("Enter time in format(hours/min/sec) :-");
float h=in.nextFloat();
float m=in.nextFloat();
float s=in.nextFloat();
float time_in_sec=h*3600+m*60+s;
float time_in_h=h+m/60+s/3600;

float x= km_per_h(y/1000,time_in_h);
float o=m_per_s(y,time_in_sec);
float z=mi_per_h(y/1609,time_in_h);
System.out.println("speed in km/h is :- "+x);
System.out.println("speed in m/s is :- "+o);
System.out.println("speed in mi/h is :- "+z);

}



}