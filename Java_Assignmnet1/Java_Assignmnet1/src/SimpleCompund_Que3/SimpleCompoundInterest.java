package SimpleCompund_Que3;

import java.util.Scanner;

public class SimpleCompoundInterest {

	public static void main(String[] args) {
		
		double p,r,t,simple,compound;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principle amount:");
		p=sc.nextDouble();
		
		System.out.println("Enter the No. of years:");
		t=sc.nextDouble();
		
		System.out.println("Enter the Rate of interest:");
		r=sc.nextDouble();
		
		simple=(p*t*r)/100;
		compound=p*(Math.pow(1 +r/100,t));
		
		System.out.println("Simple Interest = "+simple);
		System.out.println("Compound Interest = "+compound);
		}
}

