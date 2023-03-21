//Vishal here 
public class ReverseString {
    public static void main(String[] args) {
        String S = "Vishal love Coding";
        System.out.println("given string is >>>>>>>>"+S);
        char ch[] = S.toCharArray();
        int start = 0;
        for (int end = 0; end < ch.length; end++) {
            if (ch[end] == ' ') {
                reverse(ch, start, end - 1);
                start = end + 1;
            }
        }
        reverse(ch, start, ch.length - 1);
        String vishal = new String(ch);
        System.out.println("each word reverse >>>>>>>>>" + vishal);
        reverse(ch, 0, ch.length - 1);
        String vishu = new String(ch);
        System.out.println("full sentence reverse >>>>>>>" + vishu);
    }
    private static void reverse(char[] ch, int start, int end) {

        while (start <= end) {
            char v = ch[start];
            ch[start] = ch[end];
            ch[end] = v;
            start++;
            end--;
        }
    }
}
