import java.util.*;
class Multiplication
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double n1=s.nextDouble();
        double n2=s.nextDouble();
        double n=n1*n2;
        System.out.println(String.format("%.2f",n));
    }
}