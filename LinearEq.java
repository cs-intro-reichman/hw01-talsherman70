/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq 
{
    public static void main(String[] args)
 {
	 //creates three variables that their value is given by the user
	 double varA = Double.parseDouble(args[0]);
	 double varB = Double.parseDouble(args[1]);
	 double varC = Double.parseDouble(args[2]);
	 
	 System.out.println(varA + "X + " + varB + " = " + varC );//prints the equation 
	 System.out.println("X = " + (((varC-varB))/varA));// prints the solved result
 }
}