package Unsupported_Que2;

import java.util.Scanner;

public class Unsupportedoperation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st value : ");
		int a = s.nextInt();

		System.out.println("enter 2nd value : ");
		int b = s.nextInt();
		try
		{
		int ans = a/b;
		System.out.println("answer is : "+ans);
		}
		catch(ArithmeticException e){
		throw new UnsupportedOperationException("Number is not divided by zero");

		}
	}

}
