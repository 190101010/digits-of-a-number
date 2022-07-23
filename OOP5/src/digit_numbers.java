/*
 * Kübra YAYLA
 * Problem:
 * Write a method that returns the number of digits in an integer argument; for
example, 23,498 has five digits. Using this method, write a program that
repeatedly asks for input and displays the number of digits the input integer
has. Stop the repetition when the input value is negative. 
 * Date: 23.07.2022
 */

import java.util.Scanner;

public class digit_numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N;
		   do{
			System.out.println("please enter a number: ");
			N= s.nextInt();
			if(N<=0)
			{
				System.out.println("it is a negative number");
				break;
			}
			
		getNumberOfDigit(N);
		System.out.print("the digits are ");
		getDigit(N);
		}while(N>0);
	}
	static void getNumberOfDigit(int number)
	{
		 // getting the number of digits
		int length = (int)(Math.log10(number)+1);
		System.out.println("the lenght of the number: "+length);
	}
	static void getDigit(int number)
	{
		//getting the digits
		if(number / 10 >0)
		{
			getDigit(number / 10);
			
		}
		System.out.print(  number % 10 + " " );
	}
		
}
