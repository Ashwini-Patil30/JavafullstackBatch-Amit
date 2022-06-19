
public class Stringbuilder {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("StringBuilder ");
		builder.append("is a peer class of string"+"that provides much of"+"functionality of strings.");
		System.out.println(builder);

		StringBuffer builder1 = new StringBuffer("It is used to at the specified index position");
		builder1.insert(14, "insert text ");
		System.out.println(builder1);

		StringBuffer builder2 = new StringBuffer("This method returns the reversed object on which it was called");
		builder2.reverse();
		System.out.println("String buffer after reversing = " + builder2);
		}

}
