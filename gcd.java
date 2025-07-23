import java.util.*;

public class gcd {

	public static int GCD(int a, int b) {
			while ( b != 0) {
			int temp = b;
			b = a%b;
			a = temp; 
		}

		return a;

	}

	public static void main (String [] args) {

		Scanner myObj = new Scanner (System.in);
		System.out.print("Enter value of the input number a: ");
		int a = myObj.nextInt();
		System.out.print("Enter value of the input number b: ");
		int b = myObj.nextInt();

		int result = GCD(a, b);
		System.out.println("GCD of the given numbers is : " + result );

		myObj.close();

	}
}