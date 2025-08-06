import java.util.*;

public class strobogrammatic {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String input = myObj.next();
		System.out.println("Is " + input + " a strobogrammatic number? " + isStrobogrammatic(input));
		myObj.close();
	}	

	public static boolean isStrobogrammatic(String input) {

		Map<Character, Character> map = new HashMap<>();

		map.put('0', '0');
		map.put('1', '1');
		map.put('6', '9');
		map.put('8', '8');
		map.put('9', '6');

		int left = 0;
		int right = input.length() - 1;

		while(left <= right) {
			char lc = input.charAt(left);
			char rc = input.charAt(right);
			
			if(!map.containsKey(lc) || map.get(lc) != rc) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
}