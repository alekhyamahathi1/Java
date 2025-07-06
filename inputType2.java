import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class inputType2 {
public static void main (String args[] ) throws IOException {
BufferedReader inputType = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter your Input");
String Inputline = inputType.readLine();

System.out.println("Your Input is " + Inputline);
inputType.close(); }}
