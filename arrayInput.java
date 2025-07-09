import java.io.*;
import java.util.*;


class arrayInput {
public static void main (String[] args) {

Scanner myObj = new Scanner(System.in);
System.out.print("Enter the size of the array: ");

int size = myObj.nextInt();
int[] inputArray = new int[size];

for (int i = 0; i < size ; i++) {
System.out.print("Number at index " + i + " = " );
inputArray[i] = myObj.nextInt(); }

System.out.println("Array elements are: ");
for(int i = 0; i < size ; i++ ) {
System.out.print(inputArray[i] + ", ");}
System.out.println(" ");
myObj.close();
        
    } 
}  