/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins
{
    public static void main(String[] args)
 { 
	 int sum = Integer.parseInt(args[0]);//creates an integer theat its value is given by the user
	 int quart = sum / 25;//creates an integer that  represent the amount of quarters needed
	 int cent = sum % 25;//creates an integer that  represent the amount of cents needed
	 System.out.println("use " + quart + " quarters and " + cent + " cents ");//prints the amount of quarters and cents needed
 }
}