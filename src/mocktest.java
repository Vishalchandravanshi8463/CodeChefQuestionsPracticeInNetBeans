import java.util.*;
public class mocktest {

    public static void main(String[] args) throws Exception {
//        System.out.println(12345 + 54321);
//           System.out.println("2 + 2 = " + 2 + 2);
//             System.out.println(010 | 4);
//        System.out.println(010 | 4);
//        
//         long x = 5;
//
//        long y = 2;

//        byte b = (byte)x / y;
//        int open# =0;
//       int  $int=0; 
//       int v=0^5;
//        System.out.println(v);


 Scanner sc = new Scanner(System.in);
           int xorr=0;
           int n=sc.nextInt();
           while(n-->0)
           {
             int u=sc.nextInt();
             int v=sc.nextInt();
             int ans=u^v;
             
             xorr=xorr^ans;
           }
           System.out.println(xorr);
        
    }
}
