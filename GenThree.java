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
        int num1 = (int)Math.floor(Math.random() * (max - min + 1)) + min;
	int num2 = (int)Math.floor(Math.random() * (max - min + 1)) + min;
	int num3 = (int)Math.floor(Math.random() * (max - min + 1)) + min;
	
	int minNum = Math.min(Math.min(num1, num2), Math.min(num1, num3));//uses the "Math" function to return the minimalnumber of the three numbers
	
	 
	//prints the three random numbers
    System.out.println(num1);
    System.out.println(num2);
	System.out.println(num3);
	
	System.out.println("The minimal generated number was " + minNum);//prints the minimal number
  }
}
