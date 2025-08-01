//finds all possible no of co-primes from a range of numbers 

import java.util.Scanner;

public class eulersPhi {

    public static int coprimes(int a) {
        int result = a;

        for(int i = 2; i*i <= a; i++ ) {
            if(a%i == 0){
                result -= result/a;
                while(a%i == 0) {
                    a /= i;
                }
            }
        }

        if (a > 1) {
            result -= result / a;
        }

        return result; 
    }
    
    public static void main (String[] args) {
        Scanner myObj = new Scanner (System.in);
        System.out.print("Enter upper limit : ");
        int a = myObj.nextInt();
        System.out.println("Total number of co-primes present in the from 1 - " + a + " to " +  a + " are " + coprimes(a) );
    }
}

