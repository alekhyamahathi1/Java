import java.util.Scanner;

class CommonDivisorofStringsOptimal {

    public static int gcd(int x, int y) {
        if (y==0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        } 

        int gcdlen = gcd(str1.length(), str2.length());
        return str1.substring(0,gcdlen);
    }

    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);

        String str1 = myObj.nextLine();
        String str2 = myObj.nextLine();

        String x = gcdOfStrings(str1, str2);
    System.out.println(x);
    }
}
