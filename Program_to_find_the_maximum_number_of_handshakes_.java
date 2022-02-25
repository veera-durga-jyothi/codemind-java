import java.util.*;
class Shakehands
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int h=(n*(n-1));
        System.out.println(h/2);
    }
}