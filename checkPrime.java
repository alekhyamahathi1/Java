import java.util.*;

public class checkPrime {

	public static void checker(int upperLimit) {

		if(upperLimit < 2) {
		System.out.println("There are no prime numbers up to " + upperLimit + ".");
		return;
	 	}

		boolean[] isPrime = new boolean[upperLimit + 1];
		Arrays.fill(isPrime, true);
		
		System.out.println("Non Prime numbers from the range are: ");

      if (upperLimit >= 0) {
			isPrime[0] = false;
			System.out.println("0 is not prime"); }

      if (upperLimit >= 1) {
			isPrime[1] = false;
			System.out.println("1 is not prime"); }
	   
		for (int i = 2; i*i <= upperLimit; i++) {
			if(isPrime[i]){

				for (int j = i*i; j <= upperLimit; j+= i){
						isPrime[j] = false;
						System.out.println(j + " is not prime");  
				}
		 	}
		}

		System.out.println("Prime numbers from the range are: ");

		for (int i = 2; i <= upperLimit; i++) {
			if(isPrime[i]){
			System.out.println(i + " is prime");

			}
		} 
	}

	public static void main (String [] args) {
		Scanner myObj = new Scanner (System.in);

		System.out.println("Enter the upper limit of the range to check for prime: ");
		int upperLimit = myObj.nextInt();

			checker(upperLimit);

			myObj.close();
		
	}
}