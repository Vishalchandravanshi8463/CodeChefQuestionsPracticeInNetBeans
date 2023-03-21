 
    import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Position
{
		public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
                System.out.println("enter the t");
		int t=sc.nextInt();
		
		while(t>0)
		{
                    System.out.println("enter the size of array");
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		                  System.out.println("enter the array element ");
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		     }
                   /* System.out.println("enter the element ");
		      int k=sc.nextInt();
		    int l;
		   
		    
		        l=arr[k];
		    
		   */
		    for(int i=0;i<n-1;i++)
		    {
		        for(int j=0;j<n-i-1;j++)
		        {
		            if(arr[j]>arr[j+1])
		            {
		                int temp=arr[j];
		               arr[j]=arr[j+1];
		               arr[j+1]=temp;
		                
		            }
		        }
		    }
		  /*  int p=0;*/
		    for(int i=0;i<n;i++)
		    {
		      //  if(arr[i]==l)
		       // p=i;
                         System.out.print(arr[i]+" ");
		    }
		   
		    
		    t--;
		}
	}
}


