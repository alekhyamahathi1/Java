import java.util.*;

public class crt2 {

	public static void main (String[] args) {

		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter the 3 divisor numbers : ");
		int a1 = myObj.nextInt();
		int a2 = myObj.nextInt();
		int a3 = myObj.nextInt();

		System.out.println("Enter the 3 remainder numbers corresponding to above input values (let remainder be less than the divisor) : ");
		int m1 = myObj.nextInt();
		int m2 = myObj.nextInt();
		int m3 = myObj.nextInt();

		int result = 0;
		for(int b1 = a1+m1; b1 <= 1000; b1 = b1+a1) {
			if (b1%a2 == m2) {
				if(b1%a3 == m3) {
					result = b1;
					System.out.println("Solution : " + b1);
					break;
				}
			} 
		}


	}
}