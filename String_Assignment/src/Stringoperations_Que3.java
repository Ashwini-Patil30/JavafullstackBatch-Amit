
public class Stringoperations_Que3 {

	public static void main(String[] args) {
		String str = "java string pool refer to collection of strings which are stored in heap memory";
		System.out.println("1.string in lowercase is : " +str.toLowerCase());
		System.out.println("2.string in uppercase is : " +str.toUpperCase());
		System.out.println("3.replaced String is : "+str.replace('a','$'));
		System.out.println("4.string contains : "+str.contains("collection"));
		System.out.println("5.string matches : "+str.matches("java string pool refer to collection of strings which are stored in heap memory"));
		System.out.println("6.string equal : "+str.equalsIgnoreCase( "java string pool refer to collection of strings which are stored in heap memory"));
		}
}
