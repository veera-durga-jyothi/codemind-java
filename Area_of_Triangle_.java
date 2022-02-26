import java.util.*;
class Triangle
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double t=(a+b+c)/2;
        double area=t*(t-a)*(t-b)*(t-c);
        
        System.out.println(String.format("%.2f",Math.sqrt(area)));
    }
}