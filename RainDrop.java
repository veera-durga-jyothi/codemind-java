import java.util.*;
class Raindrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    int flag=0;
		int m;
		for(int i=2;i<=n/2;i++)
		{
            if(n%i==0)
            {
            	m=i;
            	if(m==3)
            	{
            		System.out.print("Pling");
			           m=0;
			           flag=1;
            	}
            	else if(m==5)
            	{
            		System.out.print("Plang");
			           m=0;
			           flag=1;
			           
            	}
            	else if(m==7)
            	{
            		System.out.print("Plong");
			           m=0;
			           flag=1;
			    }
            	
			}
            
          }
		
    	  if(flag!=1)
	      System.out.print(n);
	      
	               
	    
	}

}
