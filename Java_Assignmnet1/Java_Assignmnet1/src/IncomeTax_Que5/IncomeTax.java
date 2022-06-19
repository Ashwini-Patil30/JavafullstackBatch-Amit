package IncomeTax_Que5;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		double tax=0,salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income/CTC : ");
		salary=sc.nextDouble();
	         
	        if(salary < 180000)
	            tax = 0;
	        
	        else if(salary >= 181001 && salary <= 300000)
	            tax = salary * 10/100;
	        
	        else if(salary >= 300001 && salary <= 500000)
	            tax = salary * 20/100;
	        
	        else if(salary >= 500001 && salary <= 1000000)
	            tax = salary * 30/100;
	        System.out.println("Tax on Annual salary " + salary + " is: " + tax);
	    }

}
