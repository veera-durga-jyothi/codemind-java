import java.util.*;
class Area
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        double area=3.14*r*r;
        System.out.println(String.format("%.2f",area));
    }
}