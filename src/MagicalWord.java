/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishal chandravanshi
 */
import java.util.*;

public class MagicalWord {

//    public static void main(String args[]) throws Exception {
//
//        Scanner sc = new Scanner(System.in);
//
//        int t;
//        t = sc.nextInt();
//
//        while (t-- > 0) {
//            int n;
//            n = sc.nextInt();
//            String s;
//            s = sc.next();
//            for (int i = 0; i < s.length(); i++) {
//                int newAscii;
//                newAscii = (int)covert(s.charAt(i));
//                System.out.print((char) newAscii);
//            }
//            System.out.println("");
//
//        }
//    }
//
//    public static int covert(int n) {
//        int arr[] = {67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
//        if (n < 67) {
//            return 67;
//        } else if (n > 113) {
//            return 113;
//        } else {
//            int diff = Math.abs(n - arr[0]);
//            int ans = arr[0];
//            for (int i = 1; i < 12; i++) {
//                if (diff > Math.abs(n - arr[i])) {
//                    ans = arr[i];
//                    diff = Math.abs(n - arr[i]);
//                }
//            }
//            return ans;
//
//        }
//
//    }
//
//}
   



        public static void main(String args[]) throws Exception {

            Scanner sc = new Scanner(System.in);

            int t;
            t = sc.nextInt();

            while (t-- > 0) {
                int n;
                n = sc.nextInt();
                String s;
                s = sc.next();
                for (int i = 0; i < s.length(); i++) {
                    int newAscii;
                    newAscii = (int) covert(s.charAt(i));
                    System.out.print((char) newAscii);
                }
                System.out.println("");

            }
        }

        public static int covert(int n) {
            int arr[] = {67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};
            if (n < 67) {
                return 67;
            } else if (n > 113) {
                return 113;
            } else {
                int diff = Math.abs(n - arr[0]);
                int ans = arr[0];
                for (int i = 1; i < 12; i++) {
                    if (diff > Math.abs(n - arr[i])) {
                        ans = arr[i];
                        diff = Math.abs(n - arr[i]);
                    }
                }
                return ans;

            }

        }

    }
