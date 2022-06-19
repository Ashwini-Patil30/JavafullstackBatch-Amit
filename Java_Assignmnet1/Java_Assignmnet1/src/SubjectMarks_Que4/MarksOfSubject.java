package SubjectMarks_Que4;

import java.util.Scanner;

public class MarksOfSubject {

	public static void main(String[] args) {
		int s1,s2,s3,total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of 1st subject:");
		s1=sc.nextInt();
		
		System.out.print("Enter marks of 2nd subject:");
		s2=sc.nextInt();
		
		System.out.print("Enter marks of 3rd subject:");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
	    System.out.print("total of marks = "+total);
	    
	    if(s1>=60 && s2>=60 && s3>=60){
	    	System.out.println("\nStudent is passed");
	    }
		
		  else if((s1>=60)||(s2 >=60)||(s3 >=60)) {
		  System.out.println("\nStudent is promoted"); }
		 
	    else {
	    	System.out.println("\nStudent is failed");
	    }
	}
}

