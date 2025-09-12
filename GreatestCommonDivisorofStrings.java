import java.util.Scanner;

class GreatestCommonDivisorofStrings {

    }
    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= Math.min(str1.length()-1, str2.length()-1); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    result.append(str1.charAt(i));
                    int count = 0;

                    for ( int k = 0; k <= result.length()-1; k++) {
                        if (result.charAt(k) == str1.charAt(i)) {
                            count ++;
                            if (count > 1) {
                                result.deleteCharAt(k);
                            }
                        }
                        
                    }
                 }
            }
        return result.toString();
    }

    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);

        String str1 = myObj.nextLine();
        String str2 = myObj.nextLine();

        String x = gcdOfStrings(str1, str2);
    System.out.println(x);
    }
}
