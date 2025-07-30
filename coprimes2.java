import java.util.*;

public class coprimes2 {
 public static void main (String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter the value of a : ");
		int input1 = myObj.nextInt();

		System.out.print("Enter the value of b : ");
		int input2 = myObj.nextInt();
  
  int a = input1;
  int b = input2;

 while (b != 0) {
  int temp = b;
  b = a%b;
  a = temp;
  
 }

 if (a == 1) {
  System.out.println(input1 + " and " + input2 + " are coprimes");
	} else { System.out.println(input1 + " and " + input2 + " are not coprimes"); }
 
		myObj.close();
 }
}