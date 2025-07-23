import java.util.*;

public class gcd2 {

	public static int gcd(int a, int b){ 
	
		ArrayList<Integer> arrayOfA = new ArrayList<>();
		for (int i = 1; i <= a; i++) {
			if(a%i == 0) {
				arrayOfA.add(i);
			} 
		}

		ArrayList<Integer> arrayOfB = new ArrayList<>();
		for (int j = 1; j <= b; j++) {
			if(b%j == 0) {
				arrayOfB.add(j); 
			}
		}

		ArrayList<Integer> cdOfAB = new ArrayList<>();
			for (int divisorA : arrayOfA) {
				if (arrayOfB.contains(divisorA)) {
					cdOfAB.add(divisorA);
            		}
      		  }

         return cdOfAB.isEmpty() ? 1 : Collections.max(cdOfAB);
	}

	public static void main (String [] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter the value of a : ");
		int a = myObj.nextInt();

		System.out.print("Enter the value of b : ");
		int b = myObj.nextInt();

		System.out.println("The GCD of the input values = " + gcd(a,b));

		myObj.close();
	}
}