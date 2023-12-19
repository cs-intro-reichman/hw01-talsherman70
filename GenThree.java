/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree
{
    public static void main(String[] args)
 {
	 //creates min and max borders of the random numbers 
    int min = Integer.parseInt(args[0]);
	int max = Integer.parseInt(args[1]);
	
	//generates three numbers within the given borders
   	int num1 = (int)(Math.random() * (max - min + 1)) + min;
	int num2 = (int)(Math.random() * (max - min + 1)) + min;
	int num3 = (int)(Math.random() * (max - min + 1)) + min;
	 
	//prints the three random numbers
    System.out.println(num1);
    System.out.println(num2);
	System.out.println(num3);
	
	System.out.println("The minimal generated number was " + Math.min(num1, num2, num3));//Uses Math function to return the minimal number and prints it
  }
}
