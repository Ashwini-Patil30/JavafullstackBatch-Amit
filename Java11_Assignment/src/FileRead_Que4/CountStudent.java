package FileRead_Que4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountStudent {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\ASSANJAY\\OneDrive - Capgemini\\Documents\\Ashwini_Patil\\Java_Assignmnet\\Java11Assignments_StudentList.txt");
		String st;
		
		//opens a file in read mode
		
		//FileReader file = new FileReader("Students data.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		//Gets each line till end of file is reached
		
		while((st=br.readLine())!=null)
		System.out.println(st);
		

	}
}
