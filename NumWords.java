// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	int Number = Integer.parseInt(args[0]);
	int Ones = Number % 10;
	int Tens = (Number / 10) % 10;
	int Hundreds = (Number / 100);
	System.out.println("Hundreds: " + Hundreds + ", Tens: " + Tens + ", Ones: " + Ones);
	    // Replace this comment with your code
	}
}
