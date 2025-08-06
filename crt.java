import java.util.*;

public class crt {

    static int inv(int a, int m) {
        int m0 = m;
        int y = 0, x = 1;

        if (m == 1)
            return 0;

        while (a > 1) {
            int q = a / m;
            int t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0)
            x += m0;

        return x;
    }

    static int findMinX(int num[], int rem[], int k) {
        int prod = 1;
        for (int i = 0; i < k; i++)
            prod *= num[i];

        int result = 0;

        for (int i = 0; i < k; i++) {
            int pp = prod / num[i];
            result += rem[i] * inv(pp, num[i]) * pp;
        }

        return result % prod;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of congruence relations:");
        int k = sc.nextInt();

        int num[] = new int[k];
        int rem[] = new int[k];

        System.out.println("Enter the moduli (num values):");
        for (int i = 0; i < k; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the remainders (rem values):");
        for (int i = 0; i < k; i++) {
            rem[i] = sc.nextInt();
        }

        System.out.println("x is " + findMinX(num, rem, k));

        sc.close();
    }
}