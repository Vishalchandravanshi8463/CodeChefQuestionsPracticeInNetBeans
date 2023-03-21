
import java.util.*;
import java.lang.*;
import java.io.*;

public class CodeJam {

    public static void main(String[] args)//throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int brr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                brr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            int sum = 0;
            for (int i = 0, j = n - 1; i < n; i++, j--) {
                sum += arr[i] * brr[j];
            }
            System.out.println(sum);
        }

    }
}
