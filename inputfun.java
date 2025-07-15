import java.util.Scanner; 
import java.io.*;
import java.util.*;

class inputfun {
    public void printNumber(Scanner sc) {
        int inputNo = sc.nextInt();
        System.out.println(inputNo);
    }

    public static void main( String[] args) {
         Scanner myObj = new Scanner(System.in);
         Solution solution = new Solution();
         solution.printNumber(myObj);
         myObj.close();

    }
}

