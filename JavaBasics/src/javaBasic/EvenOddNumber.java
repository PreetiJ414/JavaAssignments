package javaBasic;

import java.util.Scanner;

public class EvenOddNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number = scanner.nextInt();
		if(number % 2 == 0)
		{
			System.out.println("Number is even:" +number);
		}
		else
		{
			System.out.println("Number is odd:" +number);
		}
	
	}

}
