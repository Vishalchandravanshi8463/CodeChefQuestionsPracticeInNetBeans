/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef_helper;

/**
 *
 * @author vishal chandravanshi
 */
import java.util.*;

public class FREQUENCY {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = new int[]{4,4,4,4,4,4,44,4};
            int visitedArr[] = new int[arr.length];
            int visited = -1;

            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visitedArr[j] = visited;
                    }
                }
                if (visitedArr[i] != visited) {
                    visitedArr[i] = count;
                }
            }
            for (int i = 0; i < visitedArr.length; i++) {
               if (visitedArr[i] != visited) {
                    System.out.println("frequency " + arr[i] + " " + visitedArr[i]);
                }
            }

        }
    }

}
/*
int n=sc.nextInt();int []arr=new int[n];
		    HashSet<Integer> set=new HashSet<Integer>();
		    for(int i=0;i<n;i++)
		    {
		        set.add(sc.nextInt());
		        
		    }
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=set.get(i);
		    }
		    Arrays.sort(arr);
		    int vishal=arr[0];
		    int count =0;
		    for(int i=1;i<n;i++)
		    {
		        if(arr[i]%vishal==0)
		        count++;
		    }
		   // System.out.println(set);
		   int v=set.size();
		  // System.out.println(v);
		   if(v==n)
		   {
		        System.out.println(v-count);
		   }
		   else
		   {
		        System.out.println(v-1);
		   }
		}
*/