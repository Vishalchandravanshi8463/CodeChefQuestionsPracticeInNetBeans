import java.util.*;
import java.lang.*;
import java.io.*;
//import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class q2{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t>0){
		    int x,y,z,p;
		    x=sc.nextInt();
		    y=sc.nextInt();
		    z=sc.nextInt();
		    p=sc.nextInt();
		    int v,s;
		    v=x-z;
		    s=y-p;
		    if(v<s){
		        System.out.println("first");
		    }
		    else if(v==s){
		        System.out.println("any");
		    }
		    else{
		        System.out.println("second");
		    }
		}
		
	}
}