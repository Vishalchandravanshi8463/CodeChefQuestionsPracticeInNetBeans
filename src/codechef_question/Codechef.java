import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//		// your code goes here
//		Scanner sc=new Scanner(System.in);
//		int t;
//                System.out.println("enter t");
//		t=sc.nextInt() ;
//		while(t>0)
//		{
//		    int x,y;
//                                    System.out.println("enter x /y");
//
//		    x=sc.nextInt();
//		  y=sc.nextInt();
//		  int p=(x+y)/2;
//		  int v=x-p;
//		  int s=y-p;
//		  if(v>s){
//		   System.out.println(v);
//		  }
//		  else
//		  {
//		       System.out.println(s);
//		  }
//                  t--;
//		}
//	}
    		public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String s=sc.next();
		    char ch[]=new char[6];
		    ch[0]='f';
		    ch[1]='r';
		    ch[2]='i';
		    ch[3]='e';
		    ch[4]='z';
		    ch[5]='a';String ss="";
//		    for(int i=0;i<s.length();i++)
//		    {
		        
		        for(int j=0;j<s.length();j++)
		        {
                            int p=0;
		        int l=0;
		            if(s.charAt(j)==ch[0]||s.charAt(j)==ch[1]||
		            s.charAt(j)==ch[2]||s.charAt(j)==ch[3]||
		            s.charAt(j)==ch[4]||s.charAt(j)==ch[5])
		            {
		                p++;
		              //  ss+=l;
		            }
		            else
		            {
		                p++;
		               // ss+=p;
		            }
                            ss+=p;
		        }
		        
		   // }
		    System.out.println(ss);
		}
	}
}
