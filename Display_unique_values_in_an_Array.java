import java.util.*;
class Unique
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int f[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                    
                    
                    
                }
                
            }
            f[i]=c;
        }
        int flag=0;
        for(int k=0;k<n;k++)
        {
            
            if(f[k]==1)
            {
                System.out.print(a[k]+" ");
                flag++;
            }
            
        }
        if(flag==0)
        {
        
            System.out.print("-1");
        }
        
        
    }
}