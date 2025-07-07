import java.io.*;
import java.util.Scanner;

public class primeNo {
public static void main (String[] args) {
Scanner myObj = new Scanner(System.in);
System.out.println("Enter a number");
int Number = myObj.nextInt();

if (Number > 1){

for(int n = 2 ; n < Number ; n++) {
if (Number % n == 0) {

System.out.println("Not Prime");
continue;
} else { 
System.out.println("Prime");
}}

}

else {
System.out.println("Enter Whole Number");} }}