/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle
{
    public static void main(String[] args)
 {
	 //Recieves 3 integers
	 int len1 = Integer.parseInt(args[0]);
	 int len2 = Integer.parseInt(args[1]);
         int len3 = Integer.parseInt(args[2]);
	 
	 boolean ans = len1 + len2 > len3 && len1 + len3 > len2 && len2 + len3 > len1;//boolean that represents the answer whether the sides create a triangle
	 System.out.println(len1 + ", " + len2 + ", " + len3 + ": " + ans);//prints the sides and the answer
  }
}
