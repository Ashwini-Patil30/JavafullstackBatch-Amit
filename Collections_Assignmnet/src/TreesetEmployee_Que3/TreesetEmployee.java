package TreesetEmployee_Que3;

import java.util.Set;
import java.util.TreeSet;

public class TreesetEmployee {
	public static void main(String[] args) 
	{
		Set<Employee> names =new TreeSet<Employee>();
		Employee E3 = new Employee(3 ,"ashu","ashuu@gmail.com",70000);
		Employee E1 = new Employee(1,"pranav","pranav@gmail.com",60000);
		Employee E10 = new Employee(10,"pooja","pooja@gmail.com",70000);
		Employee E6 = new Employee(6,"new","new@gmail.com",90000);
		Employee E8 = new Employee(8,"roli","roli@gmail.com",50000);
		Employee E5 = new Employee(5,"vriti","vriti@gmail.com",80000);
		Employee E4 = new Employee(4,"priyu","priyu@gmail.com",20000);
		Employee E2 = new Employee(2,"lalit","lalit@gmail.com",30000);
		Employee E9 = new Employee(9,"ruchi","ruchi@gmail.com",100000);
		Employee E7 = new Employee(7,"priti","priti@gmail.com",85000);
		
			names.add(E1);
			names.add(E2);
			names.add(E3);
			names.add(E4);
			names.add(E5);
			names.add(E6);
			names.add(E7);
			names.add(E8);
			names.add(E9);
			names.add(E10);
				for(Employee name:names) {
					name.display();
					}
	}
}
