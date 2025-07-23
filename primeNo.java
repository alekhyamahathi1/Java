import java.util.*;

public class primeNo {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number == 3) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        int inputNumber = scanner.nextInt();

        if (isPrime(inputNumber)) {
            System.out.println(inputNumber + " is a prime number.");
        } else {
            System.out.println(inputNumber + " is not a prime number.");
        }

        scanner.close();
    }
}