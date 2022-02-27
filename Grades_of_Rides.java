import java.util.*;
class Gradesofrides
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        if(n1>50 && n2>60 && n3>100)
        {
            System.out.println(10);
        }
        else if(n1>50 && n2>60)
        {
            System.out.println(9);
        }
        else if(n2>60 && n3>100)
        {
            System.out.println(8);
        }
        else if(n1>50 && n3>100)
        {
            System.out.println(7);
        }
        else if(n1>50|| n2>60 || n3>100)
        {
            System.out.println(6);
        }
        else
        {
            System.out.println(5);
        }
    }
}