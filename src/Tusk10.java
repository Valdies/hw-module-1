import java.util.Scanner;
public class Tusk10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), x = sc.nextLine();
        int c = 0, j = 0, i = 0;
        int[] a = new int[s.length()], b = fun(x);
        while (i < s.length()) {
            if (x.charAt(j) == s.charAt(i)) {
                i++;
                j++;
            }
            if (j == x.length()) {
                a[c] = i - j;
                j = b[j - 1];
                c++;
            }
            else if (i < s.length() && x.charAt(j) != s.charAt(i)) {
                if (j != 0) {
                    j = b[j - 1];
                }
                else {
                    i++;
                }
            }
        }
        int[] y = new int[c];
        for (int UwU = 0; UwU < c; UwU++) {
            y[UwU] = a[UwU];
        }
        if (y.length == 0) {
            System.out.println("-1");
        }
        else {
            for(int k = 0; k < y.length; k++) {
                System.out.print(y[k] + " ");
            }
        }
    }
    public static int[] fun(String x) {
        int[] d = new int[x.length()];
        int c = 0, i = 1;
        while (i < x.length()) {
            if (x.charAt(i) == x.charAt(c)) {
                c++;
                i++;
                d[i] = c;
            }
            else {
                if (c != 0) {
                    c = d[c - 1];
                }
                else {
                    d[i] = 0;
                    i++;
                }
            }
        }
        return d;
    }
}

