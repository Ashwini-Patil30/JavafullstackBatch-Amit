package Arithmeticoperation_Que1;

interface Arithmetic {
int operation(int a,int b);
}

public class ArithmeticOperation {
	public static void main(String[] args) {
	    Arithmetic add=(int a,int b)->(a+b);
		System.out.println("addition = " +add.operation(3,7));
		
		Arithmetic sub=(int a,int b)->(a-b);
		System.out.println("substraction = " +sub.operation(15,5));
		
		Arithmetic mul=(int a,int b)->(a*b);
		System.out.println("multiplication = " +mul.operation(8,8));
		
		Arithmetic div=(int a,int b)->(a/b);
		System.out.println("division = " +div.operation(15,5));
		

	}
}
