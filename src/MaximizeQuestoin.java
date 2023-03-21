
import java.util.*;

public class MaximizeQuestoin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            String s = sc.next();
            String p = "";
            int c = 0, x = 0, y = 0;
            for (int i = 0; i < l; i++) {
                // x = 0;                   //
                switch (s.charAt(i)) {
                    case '1':
                        x += (int) Math.pow(2, (l - 1 - i));
                        break;
                    case '0':
                        p = p + '1';
                        break;
                    default:
                        c++;
                        p = p + '0';
                        break;
                }
            }
            if (c == l) {
                for (int i = 0; i < l; i++) {
                    int k = (int) Math.pow(2, i);
                    if ((x / k) == 0) {
                        y = i;
                        break;
                    }
                }
            } 
            else {
                for (int i = 0; i < l; i++) {
                    if (p.charAt(i) == '1') {
                        y += (int) Math.pow(2, (l - 1 - i));
                    }
                }
                if (y > x) {
                    y = 1;
                    //   break;
                } 
                else {
                    for (int i = 0; i < l; i++) {
                        int k = (int) Math.pow(2, i);
                        
                        if (y == ((int) (x / k))) {
                            y = i;
                            break;
                        }
                    }
                }
            }
            System.out.println(y);
        }
    }
}
