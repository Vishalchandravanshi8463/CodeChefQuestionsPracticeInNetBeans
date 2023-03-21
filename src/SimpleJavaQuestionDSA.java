
import java.util.Scanner;

public class SimpleJavaQuestionDSA {

    public static void main(String[] args) {
        int n = 5;
//        System.out.println("fact is "+fact(n));int sum=1;
//        for(int i=1;i<=n;i++)
//        {
//            sum*=i;
//        }
//        System.out.println("sum is or fact is "+sum);
//        
//        System.out.println("enter the one number ");
//        Scanner sc=new Scanner (System.in);
//        int t=sc.nextInt();
//        System.out.println("check is prime or not ");
//        System.out.println("is prime "+(isPrime(t)));
//        System.out.println("\n");
        System.out.println("Now check for gcd ");
        int a = 15, b = 24;
        int g = gcdd(a, b);
        System.out.println(g);

    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    private static String isPrime(int v) {
        if (v == 1) {
            return "NO";
        }
        if (v == 2 || v == 3) {
            return "YES";
        }
        if (v % 2 == 0 || v % 3 == 0) {
            return "no ";
        }
        for (int i = 5; i * i <= v; i = i + 6) {
            if (v % i == 0 || v % (i + 2) == 0) {
                return "No";
            }
        }
        return "yes";
    }

    private static int gcd(int a, int b) {

        int ans = 1;
        int d = Math.min(a, b);
        for (int i = d; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
    private static int gcdd(int a,int b)
    {
         if(b==0)return a;
        System.out.println("a= "+a+" b= "+b);
        return gcdd(b,a%b);
        
    }
}
