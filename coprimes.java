import java.util.*;

public class coprimes {

	public static void coprime(int a, int b){ 
	
		ArrayList<Integer> arrayOfA = new ArrayList<>();
		for (int i = 1; i < a; i++) {
			if(a%i == 0) {
				arrayOfA.add(i);
			} 
		}

		ArrayList<Integer> arrayOfB = new ArrayList<>();
		for (int j = 1; j < b; j++) {
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

         if (cdOfAB.size() == 1) {
											System.out.println(a + " and " + b + " are coprimes");
									} else { System.out.println(a + " and " + b + " are not coprimes"); }
										return;
	}

	public static void main (String [] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter the value of a : ");
		int a = myObj.nextInt();

		System.out.print("Enter the value of b : ");
		int b = myObj.nextInt();

	coprime(a,b);

		myObj.close();
	}
}