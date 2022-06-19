package ArithmeticExcep_Que1;

import java.util.Scanner;

public class Arithmaticexception {

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
		System.out.println("Number is not divided by zero");
		}

	}
}
