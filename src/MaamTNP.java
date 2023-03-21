
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
public class MaamTNP {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
       
        System.out.println("input the n ");
          n=sc.nextInt();
          int sum=0;
          for(int i=1;i<=n;i++)
          {
              System.out.println(i+"*"+i+" "+" " +i*i+" ");
              sum+=(i*i);
          }
          System.out.println("");
          
          System.out.println(sum);
    }
}
