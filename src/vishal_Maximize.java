
import java.util.*;

public class vishal_Maximize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //   System.out.println("enter test case ");
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int p = 2;

            int x = Integer.parseInt(s, 2);
            int sanjana = 0;
            int arr[] = new int[x];
            int brr[] = new int[x];
            int crr[] = new int[x];
            int ans = 0;
            for (int i = 0, j = 1; i < n; i++, j++) {
                arr[i] = (int) (Math.pow(p, j));
                brr[i] = x / arr[i];//  arr[i];

                if ((brr[i] ^ x) <= x) {
                    ans = j;
                    break;
                }

                
            }
            System.out.println(ans);
        }
    }
}
