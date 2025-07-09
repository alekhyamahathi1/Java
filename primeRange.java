import java.util.*;
import java.io.*;


public class primeRange {

public static void main (String[] args) {

Scanner myObj = new Scanner(System.in);
System.out.print("Enter the size of the array: ");

int size = myObj.nextInt();
int[] inputArray = new int[size];

for (int i = 0; i < size ; i++) {
System.out.print("Number at index " + i + " = " );
inputArray[i] = myObj.nextInt(); }

System.out.println("Array elements are: ");
for(int j = 0; j < size ; j++ ) {
System.out.print(inputArray[j] + ", ");}

System.out.println(" ");
myObj.close(); 

System.out.println("Checking for Prime Numbers in the array ");
for (int k = 0; k < size ; k++) {
int n = inputArray[k];
boolean isPrime = true;

if(n <= 1) {
System.out.println( n + "is not a Prime");
isPrime = false;  } else {

for (int l = 2; l <= Math.sqrt(n); l++){
if(n % l == 0){

System.out.println(n + "is not a Prime");
isPrime = false;
break; } } }

if ( isPrime ) {
if ( n > 1 ) {
System.out.println(n + "is a Prime"); } } } } }







