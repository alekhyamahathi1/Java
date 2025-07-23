import java.util.*;

public class checkPrime {

	public static boolean checker(int upperLimit) {
		boolean Number = false;

		if(upperLimit < 2) {
		System.out.println(""There are no prime numbers up to " + upperLimit + ".");
		return; }

		boolean[] isPrime = new boolean[upperLimit + 1];
		Arrays.fill(isPrime, true); 

      if (upperLimit >= 0) isPrime[0] = false;
      if (upperLimit >= 1) isPrime[1] = false;

		for(int i = 2; i = Math.sqrt(upperLimit) {
      		return true;  } 

		if(int i = 3) {
			return true;  } 

		if(int i % 2 = 0) {
			return false; }

		for(int j = 3; j = Math.sqrt(upperLimit); j+= 2) {
			if (i % j == 0) {
				return false; } } }

			return true;

} }
	public static void main (String [] args) {
		Scanner myObj = new Scanner (System.in);

		System.out.println("Entire the upper limit of the range to check for prime: ");
		int upperLimit = myObj.nextInt();

		if( checker(upperLimit) ) {
			System.out.println(Number); } 

		else {
			Syetem.out.println(Number);}

		
} }