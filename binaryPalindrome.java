public class binaryPalindrome {

    public static boolean isBinaryPalindrome(int x) {
        int n = (int)(Math.log(x) / Math.log(2)) + 1; 
        int l = 0, r = n - 1;

        while (l < r) {
            if (((x >> l) & 1) != ((x >> r) & 1)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBinaryPalindrome(9) ? "true" : "false");  
        System.out.println(isBinaryPalindrome(10) ? "true" : "false"); 
    }
}