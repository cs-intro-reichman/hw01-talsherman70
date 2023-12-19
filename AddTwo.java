/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo 
{
    public static void main(String[] args)
 {
	 //creates two integers that their value is given by the user
	 int num1 = Integer.parseInt(args[0]);
	 int num2 = Integer.parseInt(args[1]);
	 
	 //prints the equation
	 System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
 }
}