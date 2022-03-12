import java.util.*;
class Evenodd
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int ec=0,oc=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                ec++;
            }
            else
            {
                oc++;
            }
        }
        System.out.print(ec+" "+oc);
    }
}