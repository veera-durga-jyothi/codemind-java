import java.util.*;
class Unique
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int f[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    
                    
                }
            }
            f[i]=c;
            
            
        }
        int flag=0;
        
        for(int k=n-1;k>=0;k--)
        {
            if(f[k]==1)
            {
                System.out.println(arr[k]);
                
                
                flag=1;
                break;
                
            }
        }
        if(flag==0)
        {
            System.out.println("-1");
        }
        
    }
}