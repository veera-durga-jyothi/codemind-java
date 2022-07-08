import java.util.*;
class Absolut
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int e=0,o=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                e=e+arr[i];
            }
            else
            {
                o=o+arr[i];
            }
        }
        int r=Math.abs(e-o);
        System.out.println(r);
    }
    
}