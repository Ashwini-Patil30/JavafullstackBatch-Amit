package HashsetEmployee_Que1;

import java.util.HashSet;
import java.util.Set;

public class Hashsetemployee {
	private int id;
	private String name;
	private Double salary;
	private String dept;

	public Hashsetemployee(int id, String name, Double salary, String dept) {
	//super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
	}

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Set<Hashsetemployee> emp=new HashSet<Hashsetemployee>();
	Hashsetemployee e=new Hashsetemployee(1,"ashwini",3000.89,"comp");
	Hashsetemployee e1=new Hashsetemployee(2,"priya",5000.09,"it");
	Hashsetemployee e2=new Hashsetemployee(3,"lalit",4000.89,"pharma");
	Hashsetemployee e3=new Hashsetemployee(4,"pranav",6000.89,"mech");

	emp.add(e);
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);

	for(Hashsetemployee val:emp)
	{
	System.out.println("id : "+val.id+" name : "+val.name+" salary : "+val.salary+" dept : "+val.dept);
	}
	}
}
