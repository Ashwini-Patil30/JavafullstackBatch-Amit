package Login_Que6;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sp=" ";
		/* for (int passAttempts = 0; passAttempts < 3; passAttempts++) */
		  
		System.out.println("Enter the username:");
		String uname = sc.nextLine();
		
		if((uname.contains(sp)) || uname.length()<4) {
			System.out.println("Invalid Username");
			return;
		}
		
		System.out.println("Enter the Password:");
		String upass = sc.nextLine();
		
		if((upass.contains(sp)) || upass.length()<4) {
			System.out.println("Invalid Password");
			return;
		}
		
		System.out.println("you are Registered Successfully");
		
		if(uname.equals(uname) && upass.equals(upass)) {
			System.out.println("Welcome "+uname);
			}
		  
		else {
			System.out.println("Username or Password Invalid Please contact admin");
			
		}
		  
	}
		  
			/*
			 * System.out.println("Username or Password Invalid Please contact admin");
			 */
}
		  


